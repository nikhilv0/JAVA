public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Program started...");

        int result = 10 / 0; // Runtime exception

        System.out.println("This line will never execute.");
    }
}
