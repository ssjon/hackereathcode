import java.util.*;
class test
{
    public static void main(String args[])
    {
        Stack st=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size & value & instruction");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int h1[]=new int[x];
        String i1[]=new String[z];
        System.out.println("enter the nos");
        for(int i=0;i<x;i++)
        {
            h1[i]=sc.nextInt();

        }
        System.out.println("enter the instruction");
        for(int i=0;i<z;i++)
        {
            i1[i]=sc.next();
        }
        int j=0;
        for(int k=0;k<i1.length;k++)
        {
            int temp=h1[j];
            if(i1[k].equals("harry"))
            {
                st.push(temp);
                j++;

                System.out.println(st.size());

            }
            else if(i1[k].equals("remove"))
            {
                st.pop();
            }
        }

    }
}