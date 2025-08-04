import java.util.Scanner;


public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String str = sc.nextLine();

        String reverse = "";
        for (int i = str.length()-1;i >= 0 ; i--){
            reverse += str.charAt(i);
        }

        System.out.println(reverse);

        if (str.equals(reverse)){
            System.out.println("The String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }

        // Logic For Reverse Number and check palindrome
//        int num = 131;
//        int temp=num;
//        int reverse = 0;
//
//     while (num != 0) {
//         int digit = num % 10;
//         reverse = reverse * 10 + digit;
//         num = num / 10;
//     }
//
////     System.out.println(temp);
//     System.out.println(reverse);
//
//     if (temp == reverse){
//         System.out.println("Palindrome");
//     }else {
//         System.out.println("Not Palindrome");
//     }


    }
}
