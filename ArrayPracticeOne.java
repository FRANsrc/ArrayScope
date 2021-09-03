package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ArrayPracticeOne {

    public static int[] nums = new int[10];

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int holder;
        int j = 0; // go through array

        do {
            System.out.println("Enter a 0 or 1: ");
            holder = input.nextInt();
            if(holder < 0 || holder > 1)
            {
                System.out.println("Number not accepted.");
            }
            else {
                nums[j] = holder;
                j++;
            }

        }
        while (j < nums.length);

        System.out.println('1'+ " was repeated " + findMaxConsecutiveNumber(nums) + " times");
    }

    public static int findMaxConsecutiveNumber(int[] nums)
    {
        int consecutive = 0;
        int maxConsecutive = 0;

        for (int i = 0; i < nums.length; i++)
        {
            int holder = nums[i];

            if(holder == 1)
            {
                consecutive++;
            }
            else {
                maxConsecutive = consecutive;
                consecutive = 0;
            }
        }

        if (consecutive > maxConsecutive)
        {
            maxConsecutive = consecutive;
        }

        return maxConsecutive;
    }
}
