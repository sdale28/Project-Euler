/**
 * @author Sam Dale
 * @version 11/27/13
 * AP Computer Science
 * 
 * Problem4:
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4
{
    public static void main()
    {
        for (int first=100;first<=999;first++)
        {
            for (int second=100;second<=999;second++)
            {
                String number=(first*second+"");
                String backwards="";
                for (int i=number.length()-1;i>=0;i--)
                    backwards=backwards.concat(number.charAt(i)+"");
        
                if (number.equals(backwards))
                    System.out.println(number);
            }
        }
    }
}