/**
 * Multiples of 3 and 5 below 1000 (sum).
 */
public class Problem1
{
        public static void main(String args[])
        {
            int sum=0;
            for (int n=0;n<1000;n++)
            {
                if(n%5==0 || n%3==0)
                    sum+=n;
            }
            System.out.println("Sum = " + sum);
        }
}