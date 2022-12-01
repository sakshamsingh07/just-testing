import java.util.Scanner;
public class sub 
{
    public static int subb(int a , int b)
    {
        return a-b;
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner (System.in);
        int a= scn.nextInt();
        int b=scn.nextInt();
        int ans=subb(a,b);
        System.out.println(ans);
    }
}

public static int mul(int a,int b)
{
    return a*b;
}

public static int div(int a,int b)
{
    return a/b;
}
