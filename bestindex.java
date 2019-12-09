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
        int f=2;
        for(int i=0;i<b.length;i++)//1
        {
            int flag=0;
            int j=i+1;//2
            while(i+f<b.length && j+f<=b.length)//3<6
            {

                int k=1;//
                int s=0;
                while(k<=f)
                {
                    System.out.print(b[j]+" ");
                    s=s+b[j];
                    j++;
                    k++;
                }
                System.out.print(" "+s+" ");
                f++;
                flag=1;
                j=i+f;
            }
            f=2;
            if(flag==0)
                System.out.println(b[i]);
            else
                System.out.println();

        }
    }

}