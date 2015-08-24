public class HelloWorld3 {
    public static void main(String[] args) {
        String name = "world";
        if (args.length > 0) name = args[0];
        System.out.format("Hello, %s!\n", name);
    }
}
