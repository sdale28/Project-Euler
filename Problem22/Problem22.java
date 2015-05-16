/**
 * @author Sam Dale 
 * @version 12/26/13
 * 
 * Problem22: What is the total of all the name scores in the file?
 */
import java.util.*;
import java.io.*;
import java.math.*;
public class Problem22
{
    public static void main()
    {
        int num=0;
        try
        {
            Scanner scan=new Scanner(new File("names.txt")).useDelimiter("\",\"");
            while(scan.hasNext())
            {
                num++;
                scan.next();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        String [] list=new String[num];

        try
        {
            Scanner scan=new Scanner(new File("names.txt")).useDelimiter("\",\"");
            for (int i=0;scan.hasNext();i++)
                list[i]=scan.next();
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        list[0]="MARY";
        list[list.length-1]="ALONSO";

        String temporary="";
        for (int i=0;i<list.length;i++)
        {
            for (int j=i+1;j<list.length;j++)
            {
                if(list[j].compareTo(list[i])<0)
                {
                    temporary=list[i];
                    list[i]=list[j];
                    list[j]=temporary;
                }
            }
        }

        double total=0;
        for (int i=0;i<list.length;i++)
        {    
            int sum=0;
            for (int j=0;j<list[i].length();j++)
                sum+=((int)list[i].charAt(j))-64;
            total+=(i+1)*sum;
        }
        System.out.println(total);
    }
}