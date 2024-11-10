/*class A{
    private int balance;
    public void setBalance(int balance){
    this.balance = balance;
}

public int getBalance(){
return balance;
}
}


class Encapsulation {
    public static void main(String[] args) {
        A a = new A();
        a.setBalance(10000);
        System.out.println(a.getBalance());
    }
}
*/
class personn{
    private String name;
    private int age;
public void  setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void setAge(int age){
    this.age = age;
}
public int getAge(){
    return age;
}
}

class Encapsulation{
    public static void main(String[] args) {
        personn p = new personn();
        p.setName("john");
        p.setAge(30);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}