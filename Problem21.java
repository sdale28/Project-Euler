/**
 * @author Sam Dale
 * @version 12/26/13
 *
 * Problem21: Evaluate the sum of all the amicable numbers under 10000.
 */
public class Problem21
{
    public static void main(String args[])
    {
        int sum=0;
        for (int num=1;num<10000;num++)
        {
            int sumFactors=0;
            for (int i=1;i<=num/2;i++)
                if (num%i==0)
                    sumFactors+=i;

            int sumFactors2=0;
            for (int j=1;j<=sumFactors/2;j++)
                if (sumFactors%j==0)
                    sumFactors2+=j;

            if(num!=sumFactors && num==sumFactors2)
            {
                System.out.println(num+", "+sumFactors);
                sum+=num;
            }
        }
        System.out.println(sum);
    }
}