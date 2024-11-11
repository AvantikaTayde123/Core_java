import java.util.Scanner;

class Primeno {
    public static void main(String[] args) {
    int n,m,a;
    System.out.println( "Enter the number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    if(n%2==0){
        System.out.println(" Number is not a prime number");
    }
        else{
            System.out.println("prime");
        }
    }
}
    

