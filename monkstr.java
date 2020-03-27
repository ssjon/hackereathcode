/*
 * Monk's best friend Micro's birthday is coming up. Micro likes Nice Strings very much, so Monk decided to gift him one. 
 * Monk is having N nice strings, so he'll choose one from those. But before he selects one, he need to know the Niceness value of all of those. Strings are arranged in an array A, and the Niceness value of string at position i is defined as the number of strings having position less than i which are lexicographicaly smaller than . 
 * Since nowadays, Monk is very busy with the Code Monk Series, he asked for your help.
Note: Array's index starts from 1. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * hackerearth
 * a    0
 * c    1
 * d    2
 * b    1
 * 
 */






import java.util.*;
class monkstr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int x=sc.nextInt();
        String a1[]=new String[x];
        for(int i=0;i<x;i++)
        {
            a1[i]=sc.next();
        }
        for(int i=0;i<a1.length;i++)
        {
            int c=0,k=0;
            String s1=a1[i];
            char c1=s1.charAt(0);
            int asci=(int)c1;
            for(int j=0;j<a1.length;j++)                    //a c d b
            {
                String s2=a1[j];
                char c2=s2.charAt(0);
                int ascii=(int)c2;
                if(asci>ascii)
                {
                    if(i>j)
                    {
                        k++;
                    }
                }
            }
            System.out.println(" "+k);
        }

    }
}