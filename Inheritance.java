//Single 
/*class Animall{
    public void eat(){
System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
class Dogg extends Animall{ 
public void bark(){
    System.out.println("Barking");
}
}
class Inheritance{
    public static void main(String[] args) {
        Dogg d = new Dogg();
        d.bark();
        d.sleep();
        d.eat();
    }
}*/

//Hierarchical
/*class Animall{
 public void eat()
 {
    System.out.println("Eating");
 }
    public void sleep()
    {
 System.out.println("Sleeping");
    } 
}
class catt extends Animall{
public void meow(){
    System.out.println("Meowing");
}
}
class Dogg extends Animall{ 
    public void bark(){
        System.out.println("Barking");
    }
    }
class Inheritance{
    public static void main(String[] args) {
        catt c = new catt();
        c.eat();
        c.sleep();
        c.meow();
        Dogg d = new Dogg();
        d.eat();
        d.sleep();
        d.bark();
    }
}
*/
//Multilevel
class Animall{
public void eat()
{
   System.out.println("Eating");
}
   public void sleep()
   {
System.out.println("Sleeping");
   } 
}
class catt extends Animall{
public void meow(){
   System.out.println("Meowing");
}
}
class Kitti extends catt{
    public void drink(){
        System.out.println("Drinking Milk");
    }
}
class Dogg extends Animall{ 
   public void bark(){
       System.out.println("Barking");
   }
   }
   class puppy extends Dogg{
    public void sound(){
        System.out.println("Making Sound");
    }
   }
class Inheritance{
   public static void main(String[] args) {
       Kitti c = new Kitti();
       c.eat();
       c.sleep();
       c.meow();
       c.drink();
       puppy d = new puppy();
       d.eat();
       d.sleep();
       d.bark();
       d.sound();
   }
}