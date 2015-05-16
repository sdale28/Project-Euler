/**
 * @author Sam Dale
 * @version 12/25/13
 *
 * Problem20: Find the sum of the digits in the number 100!
 */
import java.math.*;
public class Problem20
{
    public static void main(String args[])
    {
        System.out.println("Bla.");
        BigDecimal factorial=new BigDecimal("1");
        for (int i=100;i>0;i--)
            factorial=factorial.multiply(new BigDecimal(i));
        System.out.println(factorial);

        BigInteger value=factorial.toBigInteger();
        double dubVal=factorial.doubleValue();
        System.out.println(calculate(value,dubVal));
    }

    public static int calculate(BigInteger value,double dubVal)
    {
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
        return total.intValue();
    }
}