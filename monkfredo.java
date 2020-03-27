/*
 * hackerearth
 * 
 * Fredo and you are talking about a movie that you have recently watched while Monk is busy teaching Number Theory. Sadly, Monk caught Fredo talking to you and asked him to answer his question in order to save himself from punishment. The question says:

Given two weights of a and b units, in how many different ways you can achieve a weight of d units using only the given weights? Any of the given weights can be used any number of times (including 0 number of times).

Since Fredo is not able to answer the question, he asked you to help him otherwise he will get punished.

Note: Two ways are considered different if either the number of times a is used or number of times b is used is different in the two ways.


 * 
 * 
 * 
 * 
 * 
 * 
 * 
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