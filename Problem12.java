/**
 * @author Sam Dale
 * @version 11/27/13
 * 
 * Problem12: 
 * What is the value of the first triangle number to have over five hundred divisors?
 */
public class Problem12
{
    public static void main()
    {
        int triNum=0;
        boolean run=true;
        for (int i=1;run && i<100000000;i++)
        {
            triNum+=i;
            System.out.println(triNum);
            if (countInt(triNum))
            {
                System.out.println(triNum);
                run=false;
            }
        }
    }
    
    public static boolean countInt(int triNum)
    {
        int count=1;
        for (int i=1;i<(triNum/2);i++)
        {
            if (triNum%i==0)
            {
                count++;
            }
        }
        
        if (count>500)
            return true;
        return false;
    }
}