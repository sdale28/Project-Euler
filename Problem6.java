/**
 * @author Sam Dale
 * @version 11/27/13
 *
 * Problem6: Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6
{
    public static void main(String args[])
    {
        int individualTotal=0;
        int addedTotal=0;
        for (int i=1;i<=100;i++)
        {
            individualTotal+=Math.pow(i,2);
            addedTotal+=i;
        }
        System.out.println(individualTotal);
        System.out.println(Math.pow(addedTotal,2));
        System.out.println(Math.pow(addedTotal,2)-individualTotal);
    }
}