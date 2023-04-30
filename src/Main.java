import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int num2 = input.nextInt();
        int i = 1, ebob = 0;

        if (num1 > 0 && num2 > 0) {
            while (i <= num1 && i <= num2) {
                i++;
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                else {
                    System.out.print("Girdiğiniz değerlerin EBOB veya EKOK'u bulunmamaktadır. ");
                    break;
                }
            }
            if (ebob != 0) {
                int ekok = (num1 * num2) / ebob;

                System.out.println("EKOK: " + ekok);
                System.out.print("EBOB: " + ebob);
            }

        }

    }
}