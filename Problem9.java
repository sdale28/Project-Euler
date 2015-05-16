/**
 * @author Sam Dale
 * @version 11/27/13
 *
 * Problem9:
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9
{
    public static void main(String args[])
    {
        boolean works=true;
        for (int a=1;a<1000;a++)
        {
            for (int b=1;b<1000;b++)
            {
                for (int c=1;c<1000;c++)
                {
                    if (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) && a+b+c==1000)
                    {
                        System.out.println("a= "+a+"\tb= "+b+"\tc= "+c);
                        System.out.println(a*b*c);
                    }
                }
            }
        }
    }
}
