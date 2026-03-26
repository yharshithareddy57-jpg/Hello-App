public class HelloUC5 {
    public static void main(String[] args) {
        String name = "World";
        if (args.length > 0) {
            for (String arg : args) {
                System.out.println("Hello, " + arg + "!");
            }
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
