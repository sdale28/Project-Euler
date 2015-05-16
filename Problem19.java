/**
 * @author Sam Dale
 * @version 12/25/13
 *
 * Problem19: How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem19
{
    public static void main(String args[])
    {
        int numDays=365*(2001-1900);
        for (int i=1900;i<=2000;i++)
            if (i%4==0)
                numDays++;
        System.out.println("Days: "+numDays);

        int day=367;
        int sunday=0;
        int year=1901;
        System.out.println("Sunday");
        while (day<numDays)
        {
            //January
            if (day%7==0)
                sunday++;
            day+=31;
            //February
            if (day%7==0)
                sunday++;
            if (year%4==0)
                day+=29;
            else
                day+=28;
            //March
            if (day%7==0)
                sunday++;
            day+=31;
            //April
            if (day%7==0)
                sunday++;
            day+=30;
            //May
            if (day%7==0)
                sunday++;
            day+=31;
            //June
            if (day%7==0)
                sunday++;
            day+=30;
            //July
            if (day%7==0)
                sunday++;
            day+=31;
            //August
            if (day%7==0)
                sunday++;
            day+=31;
            //September
            if (day%7==0)
                sunday++;
            day+=30;
            //October
            if (day%7==0)
                sunday++;
            day+=31;
            //November
            if (day%7==0)
                sunday++;
            day+=30;
            //December
            if (day%7==0)
                sunday++;
            day+=31;

            year++;
        }
        System.out.println(sunday);
    }
}