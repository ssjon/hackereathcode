


import java .util.*;
class bestindex
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the order");
        int x=sc.nextInt();
        int b[]=new int[x];
        int sum=0;
        for(int l=0;l<x;l++)
        {
            b[l]=sc.nextInt();    //-3 2 3 -4 3 1
        }
        for(int i=0;i<b.length;i++)
        {
            int t=b[i];
            int n=2,s=0;
            int k=i+1;
            int len=b.length;
            while(n<len)
            {

                for(int j=k;j<=n;j++)
                {
                    s=s+b[j];
                }
                k=k+n;
                if(k<=b.length-2)
                {
                    n++;
                    continue;
                }
                else
                {
                    s=s+b[i];
                    break;
                }
                
                
                
            }
            sum=s+t;
            System.out.println(sum);
            len--;
        }
    }

}
