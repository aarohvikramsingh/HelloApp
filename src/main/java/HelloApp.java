public class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();

            // Append every name with a comma and space
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove the final trailing comma and space (the last 2 characters)
            String finalNames = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}