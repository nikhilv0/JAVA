import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args)  throws FileNotFoundException{
        // ❌ Uncomment this line to see compile-time error:
         FileReader fr = new FileReader("abc.txt");

        // ✅ Handled with try-catch
//        try {
//            FileReader fr = new FileReader("abc.txt");
//            System.out.println("File opened successfully!");
//        } catch (IOException e) {
//            System.out.println("Caught Checked Exception: " + e.getMessage());
//        }

    }
}
