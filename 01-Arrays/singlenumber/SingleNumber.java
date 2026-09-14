// package 01-Arrays;
import java.util.Scanner;
/*
Problem: Single Number
Platform: LeetCode
Difficulty: Easy

Approach:
Using XOR operation.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class SingleNumber {
      public static int singleNumber(int[] nums) {

        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNumber(nums);

        System.out.println("Single number is: " + result);

        sc.close();
    }
}
