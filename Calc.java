public class Calc
{
    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int sub(int a, int b)
    {
        return a-b;
    }
    public static void main(String args[])
    {
        int a,b;
        a=5;
        b=6;
        int c = add(a,b);
        int d = sub(a,b);
        System.out.print(c);

    }
}