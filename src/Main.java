import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] userNums = new int[5];

        System.out.println("Enter 5 numbers");

        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            userNums[i] = scanner.nextInt();
        }
        int products = findProduct(userNums, userNums.length);
        System.out.println("The product of your numbers is: " + products);
    }

    public static int findProduct(int[] nums, int index ) {
        if (index == 0){
            return 1;
        }
        return findProduct(nums, index - 1) * nums[index - 1];

    }
}