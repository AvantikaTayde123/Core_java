class Aa {
    public static void showdata(){
    System.out.println("Hello");
    }
}
class B extends Aa{
    public static void showdata(){
System.out.println("HelloWorld");
    }
}
class Ab {
    public static void main(String[] args) {
        // B b = new B();
        // b.showdata(); 
        B.showdata();
        Aa.showdata();
    }
}

