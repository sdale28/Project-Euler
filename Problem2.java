/**
 * @author Sam Dale
 * @version 10/2/13
 *
 * Add the even Fibonacci numbers less than 4 million.
 */
public class Problem2
{
    public static void main(String args[])
    {
        int fibnum=1;
        int fibnumminus=0;
        int sum=0;
        while (fibnum<=4000000)
        {
            if (fibnum%2==0)
                sum+=fibnum;
            fibnum=fibnum+fibnumminus;
            fibnumminus=fibnum-fibnumminus;
        }
        System.out.println(sum);
    }
}