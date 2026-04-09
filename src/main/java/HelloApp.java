public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            int count = 0; // Keeping track to avoid a trailing comma

            // The Enhanced For Loop
            for (String name : args) {
                names.append(name);
                count++;

                // Add a comma and space if it's not the last name
                if (count < args.length) {
                    names.append(", ");
                }
            }
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}