/**
 * @author Sam Dale
 * @version 12/1/13
 * 
 * Problem16: What is the sum of the digits of the number 2^1000?
 */
import java.math.*;
public class Problem16
{
    public static void main()
    {
        BigInteger value=new BigInteger("2");
        value=value.pow(1000);
        System.out.println(value);

        double dubVal=value.doubleValue();
        int count=0;
        while (dubVal/Math.pow(10,count)>9)
            count++;
        System.out.println(count);

        BigInteger total=new BigInteger("0");
        for (int i=count;i>=0;i--)
        {
            BigInteger current=new BigInteger("10");
            current=current.pow(i);
            total=total.add(value.divide(current));
            value=value.mod(current);
        }
        System.out.println(total);
    }
}