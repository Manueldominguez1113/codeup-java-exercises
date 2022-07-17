public class MaximumSubsequenceSum {
    public static void main (String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        // to spell out whats happening...
        /*
            (-2)+(-3)= -5 -> less than zero, so max so far is 0, continuing from 0.
              0 +  4 =  4 ->  more than max, so max so far is 4, continuing from 4.
              4 +(-1)=  3 -> more than zero, but less than previous max, max so far is still 4, max ending here is 3, since it's positive we continue from 3.
              3 +(-2)=  1 -> max so far is still 4, continuing from +1.
              1 +  1 =  2 -> max so far is still 4, continuing from +2.
              2 +  5 =  7 -> new max, max so far is now 7, continue from +7.
              7 +(-3)=  4 -> less than previous max, so max so far is still 7.
          with the array completed the result is that 7 was the max we could get to this way.

             */

        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[])
    {
        int size = a.length; // array length
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0; //as named

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i]; // max ending here is the previous sum of our math +(current num)
            if (max_so_far < max_ending_here) //if that's greater than our highest so far...
                max_so_far = max_ending_here; // make that the new max
            if (max_ending_here < 0)          // if our max ever goes below zero...
                max_ending_here = 0;        // revert to zero to continue test at 0
        }
        return max_so_far;
    }
}
