/*
 * hackerearth
 * input 2 3 7    output 1
 * 
 * input 2 3 6     output 2
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
class monkfredo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three nos");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int c=0;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                int t=x*i+y*j;
                if(t==z)
                    c++;
            }
        }
        System.out.println(c);
    }
}