/*abstract class phone{
abstract void screen();

public void call(){
    System.out.println("You can call");
}
 public void msg(){
    System.out.println("you can message");
 }
}

class Vivo extends phone{
public void screen(){
    System.out.println(" Large screen");
}
public void call(){
    System.out.println("You can call");
}
}

class Oppo extends phone{
public void screen(){
    System.out.println("Large screen");
}
public void msg(){
    System.out.println("You can msg");
}
}


class Abstraction {
    public static void main(String[] args) {
        //phone p = new phone();
        Vivo vivo = new Vivo();
        vivo.screen();
        vivo.call();
        vivo.msg();
        Oppo op=new Oppo();
        op.screen();
        op.msg();
        op.call();
    }
}*/

/*abstract class Animall1{
    private String name;
    public Animall1(String name){
        this.name = name;
    }
    public abstract void makesound();
    public String getName(){
        return name;
    }
}
class Dogg1 extends Animall1
 {
    public Dogg1(String name){
    super(name);
 }
 public void makesound(){
System.out.println(getName() +" barks");
}
 }
 class Catt1 extends Animall1{
    public Catt1(String name){
        super(name);
    }
    public void makesound(){
        System.out.println(getName() +" Meow");
    }
 }
 class Abstraction {
 public static void main(String[] args) {
    Animall1 d = new Dogg1("Buddy");
    Animall1 c = new Catt1("Fluffy");
   d.makesound();
   c.makesound();
 }
    
 }*/
 abstract class Person {
    abstract void printInfo();
}

// Child Class
class employee extends Person {
    void printInfo()
    {
        String name = "aakanksha";
        int age = 21;
        float salary = 55552.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

// Driver Class
class Abstraction {
    // main function
    public static void main(String args[])
    {
        // object created
      Person   s = new employee();
        s.printInfo();
    }
}

