import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//           Java döngüler ile 0'dan girilen sayıya
//           kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.


        int i = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = keyboard.nextInt();

        double total=0;
        double count=0;
        for (; i <= number; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                //System.out.println("i=" + i);
                total += i;
                System.out.println(i+"\t12 ye tam bölünür ");
                count++;
                //System.out.println(total);
            }



        }
        double ave;
        ave = total /count;
        System.out.println(number +"'e kadar 12'ye tam bölünen sayıların ortalaması:" + ave);
    }
}