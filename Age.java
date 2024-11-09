import java.util.Scanner;
class Age{
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter the age of frirst person");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the age of Second person");
        b=sc.nextInt();
        System.out.println("Enter the age of Third person");
        c=sc.nextInt();

        if(a>b & a>c)
        System.out.println("oldest:"+a);
        if(b>a & b>c)
        System.out.println("oldest"+b);
        if(c>a & c>b)
        System.out.println("oldest:"+c);

        if(a<b & a<c)
        System.out.println("youngest:"+a);
        if(b<a & b<c)
        System.out.println("youngest"+b);
        if(c<a & c<b)
        System.out.println("youngest:"+c);

        else
        System.out.println("All are equal");
    }
}