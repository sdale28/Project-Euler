/**
 * @author Sam Dale 
 * @version 12/25/13
 * 
 * Problem18: By starting at the top of the triangle below and moving to adjacent numbers on the row below, find the maximum total from top to bottom.
 */
import java.util.*;
import java.io.*;
public class Problem18
{
    public static void main()
    {
        int [][] list=list();
        for (int i=1;i<list.length;i++)
        {
            for (int j=0;j<i;j++)
                System.out.print(list[i][j]+" ");
            System.out.println();
        }
        
        for (int i=list.length-2;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                if (list[i+1][j]>list[i+1][j+1])
                    list[i][j]+=list[i+1][j];
                else
                    list[i][j]+=list[i+1][j+1];
            }
        }
        System.out.println(list[1][0]);
    }
    
    public static int [][] list()
    {
        int number=0;
        for (int i=1;i<=15;i++)
            number+=i;
        int [] nums=new int [number];
        int lines=0;
        
        try
        {
            Scanner scan=new Scanner(new File("nums.txt"));
            int i=0;
            while (scan.hasNextInt())
                nums[i++]=scan.nextInt();
                
            Scanner reader=new Scanner(new BufferedReader(new FileReader("nums.txt"))).useDelimiter("\n");
            for (int lineNum=1;reader.hasNext();lineNum++)
            {
                lines++;
                reader.next();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            int [][] list=new int[lines+1][lines];
            int element=0;
            for (int i=1;i<=lines;i++)
            {
                for (int j=0;j<i;j++)
                {
                    list[i][j]=nums[element];
                    element++;
                }
            }
            return list;
        }
    }
}