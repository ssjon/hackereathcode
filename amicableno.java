*/
    
    /*
enter the nos& term
248
5
284
496
1184
1210
2620
*/
    
    
    
    */










import java.util.*;
class amicableno
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the nos& term");
        int x=sc.nextInt();
        int z=sc.nextInt();
        int c=0;
        do
        {
            
            int s=isami(x);
            if(isami(s)==x)
            {
                c++;
                System.out.println(x);
            }
            x++;
            
           
           
        }while(c<z);
        
    }
    static int isami(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                 s=s+i;
            }
            
        }
        return s;
    }
    
}
