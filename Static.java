class Static {
    //Static Block
static{
    System.out.println("Avani");
}

//Static Method
//static{
public static String hellow(){
    return "Hello World";
}  
//}

// Constructor
Static(){
    System.out.println("Hello Avani");
}

//Instance Block
{
    System.out.println("Hello");
}

//}
//class Deiver{
public static void main(String[] args) {
   Static s = new Static();
    //Static.hellow();
    System.out.println(Static.hellow());
}
}
