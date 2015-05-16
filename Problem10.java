/**
 * @author Sam Dale
 * @version 11/27/13
 *
 * Problem10:
 * Find the sum of all the primes below two million.
 */
public class Problem10
{
    public static void main(String args[])
    {
        long total=2;
        for (int i=3;i<2000000;i++)
        {
            if (i%2==1 && prime(i))
            {
                total+=i;
                System.out.println(i);
            }
        }
        System.out.println(total);
    }

    public static boolean prime(int i)
    {
        for (int j=2;j<=Math.sqrt(i);j++)
        {
            if (i%j==0)
                return false;
        }
        return true;
    }
}
