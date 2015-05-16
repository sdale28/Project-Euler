/**
 * @author Sam Dale
 * @version 11/28/13
 *
 * Problem15:
 * How many such routes are there through a 20×20 grid?
 */
public class Problem15
{
    public static void main(String args[])
    {
        double [] row0=new double [1];
        double [] row1=new double [2];
        double [] row2=new double [3];
        double [] row3=new double [4];
        double [] row4=new double [5];
        double [] row5=new double [6];
        double [] row6=new double [7];
        double [] row7=new double [8];
        double [] row8=new double [9];
        double [] row9=new double [10];
        double [] row10=new double [11];
        double [] row11=new double [12];
        double [] row12=new double [13];
        double [] row13=new double [14];
        double [] row14=new double [15];
        double [] row15=new double [16];
        double [] row16=new double [17];
        double [] row17=new double [18];
        double [] row18=new double [19];
        double [] row19=new double [20];
        double [] row20=new double [21];
        double [] row21=new double [22];
        double [] row22=new double [23];
        double [] row23=new double [24];
        double [] row24=new double [25];
        double [] row25=new double [26];
        double [] row26=new double [27];
        double [] row27=new double [28];
        double [] row28=new double [29];
        double [] row29=new double [30];
        double [] row30=new double [31];
        double [] row31=new double [32];
        double [] row32=new double [33];
        double [] row33=new double [34];
        double [] row34=new double [35];
        double [] row35=new double [36];
        double [] row36=new double [37];
        double [] row37=new double [38];
        double [] row38=new double [39];
        double [] row39=new double [40];
        double [] row40=new double [41];
        double [][] list={row0,row1,row2,row3,row4,row5,row6,row7,row8,row9,row10,row11,row12,row13,row14,row15,row16,row17,row18,row19,row20,row21,row22,row23,row24,row25,row26,row27,row28,row29,row30,row31,row32,row33,row34,row35,row36,row37,row38,row39,row40};

        for (int i=0;i<=40;i++)
        {
            list[i][0]=1;
            if (i>0)
            {
                list[i][1]=i;
                if (i>1)
                {
                    for (int j=1;j<list[i].length-1;j++)
                        list[i][j]=list[i-1][j-1]+list[i-1][j];
                }
                list[i][list[i].length-1]=1;
            }
        }

        for (int i=0;i<list.length;i++)
        {
            for (int j=0;j<list[i].length;j++)
            {
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(list[2*20][20]);
    }
}
