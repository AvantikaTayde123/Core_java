/*abstract class RBI
{
   // abstract void loan();

RBI(String facility){
//System.out.println("provide insourance facility");
}
}
/*class Hdfc extends RBI{
    void loan(){
        System.out.println("provide Loan facility");
    }
}*/
 /*class Abs {
    public static void main(String[] args) {
        RBI r = new ();
       // r.RBI();
     //   Hdfc hdfc = new Hdfc();
       // hdfc.loan();
    }
}*/

abstract class Parent{
    abstract void details();
    String n;
    Parent (String name){
     n=name;
    }

}
class Child extends Parent {
    void details(String name){ 
 System.out.println("hello");
}
}
class Abs{
    public static void main(String[] args) {
       Child c = new Child();
       c.details("Abc"); 
    }
}

