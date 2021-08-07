import java.io.PrintWriter;

public class HelloBMC {
    public static void main(String[] args) throws Exception {

        PrintWriter writer = new PrintWriter("Greetings.txt", "UTF-8");
        writer.println("Hello BMC");
        writer.println("number of words in the first job: " + args[0]);
        writer.println("number of files in the first job directory: " + args[1]);
        writer.close();
    }
}
