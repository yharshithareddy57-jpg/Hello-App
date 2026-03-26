public class HelloUC6 {
    public static void main(String[] args) {
        String greeting = "Hello, ";
        String delimiter = ", ";
        StringBuilder sb = new StringBuilder();
        if (args.length > 0) {
            for (String arg : args) {
                sb.append(greeting).append(arg).append(delimiter);
            }
            String fullGreeting = sb.toString();
            String result = fullGreeting.substring(0, fullGreeting.length() - delimiter.length());
            System.out.println(result);
        } else {
            System.out.println(greeting + "World!");
        }
    }
}
