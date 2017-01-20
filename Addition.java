/**
 * Created by Administrator on 2017/1/20.
 */
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        //creat a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("enter first integer");
        number1 = input.nextInt();

        System.out.print("enter second integer");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.println(sum);
    }
}
