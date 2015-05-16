/**
 * @author Sam Dale 
 * @version 10/7/13
 * 
 * Problem 3: What is the largest prime factor of the number 600851475143?
 */
public class Problem3
{
    public static void main()
    {
        long n=600851475143L;
        boolean primefactor=false;
        for (int i=1;i<=Math.sqrt(n);i++)
        {
            if (n%i==0) //i is factor
            {
                primefactor=primefactor(i);
                if (primefactor==true)
                    System.out.println(i);
            }
        }
    }
    
    public static boolean primefactor(int i)
    {
        boolean primefactor=true;
        for (int j=2;j<i/2;j++)
            if (i%j==0)
                primefactor=false;
        return primefactor;
    }
}