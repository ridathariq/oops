import java.util.*;

class employee {

String name;
int age;
String salary;

void printSalary() {
System.out.println(salary);
}
}


class Officer extends employee {

String special;
Officer(String name,int age,String salary)  {

this.name=name;
this.age=age;
this.special=special;
this.salary=salary;
}

void display() {

System.out.println(name);
System.out.println(age);
System.out.println(special);
System.out.println(salary);

}
}


class Employ {

public static void main(String[]args)   {

Scanner sc=new Scanner(System.in);

System.out.println("\nenter details\n");

System.out.println("enter name");
String name=sc.nextLine();

System.out.println("enter age");
int age=sc.nextInt();

System.out.println("enter salary");
String salary=sc.nextLine();

System.out.println("enter special");
String special=sc.nextLine();

Officer of=new Officer(name,age,salary);

of.display();
of.printSalary();

}
}

