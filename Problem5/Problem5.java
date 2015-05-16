/**
 * @author Sam Dale
 * @version 11/27/13
 * AP Computer Science
 * 
 * What is the smallest possible number that is evenly divisible by all of the numbers from 1 to 20?
 * 1 to 10 should equal 2520.
 */
public class Problem5
{
    public static void main()
    {
        double [] nums={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; //Have to break it down, because to big to do at once. Answer is: 232792560.
        double total=1;
        for (int i=0; i<nums.length;i++)
            total*=nums[i];
        System.out.println(total);
        
        for (int i=(int) total; total>0; total--)
        {
            boolean works=true;
            for (int j=0;j<nums.length;j++)
            {
                if (total%nums[j]!=0)
                    works=false;
            }
            
            if (works==true)
                System.out.println(total);
        }
    }
}