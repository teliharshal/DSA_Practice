import java.util.Scanner;

public class StriverSheetBasics {
    public static void main(String[] args) {
        //Count Digit Questiom
//        int a = 1;
//        if(a < 0){
//            a = -a;
//        }
//        //Basic Question
//        int digit =0;
//        while (a != 0){
//            a /= 10;
//            digit ++;
//        }
//        System.out.println(digit);

        //Reverse Integer & Palindrome Check
//        int originalNo = a;
//
//        if(a < 0){
//            a = -a;
//        }
//        int reverse =0;
//         while (a != 0){
//             int digit = a % 10;
//             reverse = reverse*10+digit;
//             a /= 10;
//         }
//
//        System.out.println("Reverse No is" +reverse);
//
//         if(originalNo == reverse){
//             System.out.println("Given No is Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//
//

        //Armstrong No Check

        //Cont Digits in no
//         int digit =0;
//         while (a != 0){
//            a /= 10;
//            digit ++;
//         }
//
//      int sum =0;
//
//      while(a != 0){
//           sum +=  Math.pow(a , digit);
//           a /= 10;
//      }
//
//      if(sum == a){
//          System.out.println("The Number is Armstrong Number");
//      }else {
//          System.out.println("Not Armstrong Number");
//      }

        //Check Prime Number
//        boolean isPrime = true;
//        if(a <= 1){
//            isPrime = false;
//        }
//
//        int i = 2;
//        while(i <= a/2 ){
//            if(a % i ==0){
//                isPrime = false;
//                break;
//            }
//            i++;
//        }
//
//        if(isPrime){
//            System.out.println(isPrime + " It is Prime Number");
//        }else {
//            System.out.println("Not Prime number");
//        }


        //Print Message N times without using Recursion
        String msg = "Hello World";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of n");
        int n=sc.nextInt();

//        for(int i=0;i<n;i++){
//            System.out.println("Message is " + msg);
//        }
        printMsg(n);
    }

    public static void printMsg(int n){
       //Base Case Condition
        if(n <= 0){
            return;
        }
        System.out.println("Alice");
        printMsg(n-1);
    }

}
