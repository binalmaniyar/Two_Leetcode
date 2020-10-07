package leetcode;

import java.util.*;
public class TwoSums {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n,target;
        n=s.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        target=s.nextInt();
        
        int[] ans = findtwoSums(nums,target);
        if(ans.length == 2)
        {
            System.out.println("Solution : " +ans[0]+ "," +ans[1]);
        }
        else
        {
            System.out.println("No solution found");
        }
    }
    
    public static int[] findtwoSums(int[] nums,int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
