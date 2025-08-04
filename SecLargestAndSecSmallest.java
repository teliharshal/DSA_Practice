public class SecLargestAndSecSmallest {

    public static int secondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] < firstMax && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("First Largest Number is " + firstMax);

        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondMax;
        }
    }

    public static int secondSmallest(int[] arr) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] > firstMin && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }

        System.out.println("First Smallest Number is " + firstMin);

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("Second Smallest Number does not exist");
            return -1;
        } else {
            return secondMin;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10};

        System.out.println("Second Largest Number: " + secondLargest(arr));
        secondSmallest(arr);
    }
}
