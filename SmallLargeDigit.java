public class SmallLargeDigit {
    public static void main(String[] args) {
        int number = 2345;

        int digits = 0;

        int temp = number;
        //cont the total digits in number
        while (temp > 0) {
           digits ++;
           temp = temp/10;
        }

        int smallNo = 9;
        int largeNo = 0;

        for (int i=0;i<digits;i++){
            int digit = number % 10;
            number = number/10;
            if(digit > largeNo){
                largeNo = digit;
            } else if (digit < smallNo) {
                smallNo = digit;
            }
        }

        System.out.println("Small Digit in the number is " + smallNo);
        System.out.println("Largest Digit in the number is " + largeNo);
    }
}
