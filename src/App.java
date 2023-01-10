import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        int baseNumber;

        System.out.println("Enter the pyramid's base number:");
        baseNumber = Integer.parseInt(myScanner.nextLine());
        System.out.println("");

        for (int i = 1; i <= baseNumber; i++) {
            String line = "";
            for (int j = 0; j < i; j++) {
                line += i;
            }
            System.out.println(line);
        }
    }
}
