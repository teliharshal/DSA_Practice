import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        int originalNumber = number;

        int count = 0;
        int result =0;

        //Count Number Of Digits in Number
        int temp = number;
        while (temp != 0){
            count++;
           temp /= 10;
        }

        //Count Armstrong number
        temp = number;
        while (temp != 0){
            int digit = temp % 10;
            result += Math.pow(digit ,count);
            temp /= 10;
        }

        if(originalNumber == result){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("NOT Armstrong Number");
        }
    }

}
