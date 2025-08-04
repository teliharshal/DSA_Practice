import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();

        if(number <= 1){
            System.out.println("Number is Not Prime Number");
        }

        for (int i=2;i<number;i++){
            if(number%i == 0){
                System.out.println("The Number is Not  Prime Number");
                break;
            }
            else {
                System.out.println("Number Is Prime Number");
                break;
            }
        }
    }
}
