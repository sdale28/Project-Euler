/**
 * @author Sam Dale
 * @version 11/28/13
 *
 * Problem14:
 * Longest Collatz Sequence
 * Which starting number, under one million, produces the longest chain?
 */
public class Problem14
{
    public static void main(String args[])
    {
        long longest=0;
        for (int i=2;i<1000000;i++)
        {
            long currentNum=i;
            int currentLength=0;
            while (currentNum!=1)
            {
                if (currentNum%2==0)
                    currentNum=currentNum/2;
                else
                    currentNum=3*currentNum+1;
                currentLength++;
            }

            if (currentLength>longest)
            {
                longest=currentLength;
                System.out.println(i);
            }
        }
    }
}