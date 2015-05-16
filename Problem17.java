/**
 * @author Sam Dale
 * @version 12/1/13
 *
 * Problem17: If all the numbers from 1 to 1000 (one thous) inclusive were written out in words, how many letters would be used?
 */
public class Problem17
{
    public static void main(String args[])
    {
        String [] nums = new String[1001];
        for (int i=1;i<=1000;i++)
            nums[i]="";

        for (int i=1;i<1000;i++)
        {
            if(i/100==1)
                nums[i]=nums[i].concat("onehundred");
            if(i/100==2)
                nums[i]=nums[i].concat("twohundred");
            if(i/100==3)
                nums[i]=nums[i].concat("threehundred");
            if(i/100==4)
                nums[i]=nums[i].concat("fourhundred");
            if(i/100==5)
                nums[i]=nums[i].concat("fivehundred");
            if(i/100==6)
                nums[i]=nums[i].concat("sixhundred");
            if(i/100==7)
                nums[i]=nums[i].concat("sevenhundred");
            if(i/100==8)
                nums[i]=nums[i].concat("eighthundred");
            if(i/100==9)
                nums[i]=nums[i].concat("ninehundred");

            if (i>100 && i%100!=0)
                nums[i]=nums[i].concat("and");

            if (i%100==10)
                nums[i]=nums[i].concat("ten");
            if (i%100==11)
                nums[i]=nums[i].concat("eleven");
            if (i%100==12)
                nums[i]=nums[i].concat("twelve");
            if (i%100==13)
                nums[i]=nums[i].concat("thirteen");
            if (i%100==14)
                nums[i]=nums[i].concat("fourteen");
            if (i%100==15)
                nums[i]=nums[i].concat("fifteen");
            if (i%100==16)
                nums[i]=nums[i].concat("sixteen");
            if (i%100==17)
                nums[i]=nums[i].concat("seventeen");
            if (i%100==18)
                nums[i]=nums[i].concat("eighteen");
            if (i%100==19)
                nums[i]=nums[i].concat("nineteen");

            if (i%100>=20 && i%100<=29)
                nums[i]=nums[i].concat("twenty");
            if (i%100>=30 && i%100<=39)
                nums[i]=nums[i].concat("thirty");
            if (i%100>=40 && i%100<=49)
                nums[i]=nums[i].concat("forty");
            if (i%100>=50 && i%100<=59)
                nums[i]=nums[i].concat("fifty");
            if (i%100>=60 && i%100<=69)
                nums[i]=nums[i].concat("sixty");
            if (i%100>=70 && i%100<=79)
                nums[i]=nums[i].concat("seventy");
            if (i%100>=80 && i%100<=89)
                nums[i]=nums[i].concat("eighty");
            if (i%100>=90 && i%100<=99)
                nums[i]=nums[i].concat("ninety");

            if (i%10==1 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("one");
            if (i%10==2 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("two");
            if (i%10==3 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("three");
            if (i%10==4 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("four");
            if (i%10==5 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("five");
            if (i%10==6 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("six");
            if (i%10==7 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("seven");
            if (i%10==8 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("eight");
            if (i%10==9 && !(i%100<20 && i%100>9))
                nums[i]=nums[i].concat("nine");
        }
        nums[1000]="onethousand";

        int count=0;
        for (int i=1;i<=1000;i++)
        {
            System.out.println(nums[i]);
            count+=nums[i].length();
        }
        System.out.println(count);
    }
}