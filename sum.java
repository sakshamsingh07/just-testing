import java.util.Scanner;
class sum
{
    public static int summ(int a,int b)
    {
        return a+b;
    }
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int ans=summ(a,b);
        System.out.println(ans);
    }
}