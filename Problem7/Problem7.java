/**
 * @author Sam Dale
 * @version 11/27/13
 * 
 * Problem7:
 * What is the 10001st prime number?
 */
public class Problem7
{
    public static void main()
    {
        int count=0;
        boolean prime=false;
        
        for (int i=2;count<10001 && i<1000000000;i++)
        {
            prime=prime(i);
            if (prime)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean prime(int i)
    {
        boolean prime=true;
        for (int j=2;j<=i/2 && prime;j++)
        {
            if (i%j==0)
                prime=false;
        }
        return prime;
    }
}