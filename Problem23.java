/**
 * @author Sam Dale 
 * @version 12/26/13
 * 
 * Problem23: Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 */
import java.util.*;
public class Problem23
{
    public static void main()
    {
        List<Integer> abundants=new ArrayList<>();
        for (int i=1;i<28123/2;i++)
        {
            int sumFactors=0;
            for  (int j=1;j<=i/2;j++)
                if (i%j==0)
                    sumFactors+=j;

            if (sumFactors>i)
                abundants.add(i);
        }
        System.out.println(abundants);

        List<Integer> abundAdd=new ArrayList<>();
        for (int i=0;i<abundants.size();i++)
        {
            for (int j=0;j<abundants.size();j++)
            {
                abundAdd.add(abundants.get(i)+abundants.get(j));
            }
        }
        System.out.println("Done.");
        System.out.println(abundants.size());
        int sum=0;
        for (int i=1;i<=20;i++)
        {
            boolean works=true;
            for (int j=0;j<abundants.size();j++)
            {
                if (abundAdd.get(j)==i)
                    works=false;
                System.out.println("Yo");
            }
            if (works==true)
                sum+=i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}