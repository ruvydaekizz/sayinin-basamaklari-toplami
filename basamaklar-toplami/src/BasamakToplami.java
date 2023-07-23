import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        int all = 0;
        int newNumber = number;

        while (newNumber != 0) {
            all += newNumber % 10;
            newNumber /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + all);


    }
}
