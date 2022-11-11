class Employee{
    int slno;
    String name;
    int age;

Employee(int slno,String name, int age){
    this.slno=slno;
    this.name=name;
    this.age=age;
}

void details(){
    System.out.println("Name of Employee "+slno + " " + name);
    System.out.println("age of Employee " +slno+ " " + age);
    System.out.println(" ");

}
}

class emp{
public static void main(String args[]){
Employee E1=new Employee(1,"VK",37);
Employee E2=new Employee(2,"abd",40);
Employee E3=new Employee(3,"msd",41);

E1.details();
E2.details();
E3.details();

System.out.println(" ");
System.out.print("Elder Employee is!!! ");

if(E1.age<E2.age && E1.age<E3.age){
System.out.println("Employee 1");
}
else if(E2.age>E3.age){
System.out.println("Employee 2");
}
else {
System.out.println("Employee 3");
}
}
}
