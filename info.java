class info {
    int eid;
    String name;
    static String company="infobeans";

info(int eid, String name)
{
    this.eid = eid;
    this.name = name;
}

void display(){
    System.out.println(name +" " + eid + " " + company);
}
public static void main(String[] args) {
    info i = new info(123, "Avani");
    info j = new info(234,"karan");
    i.display();
    j.display();
    
}
}