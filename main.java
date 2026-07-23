class employee  {

void display(){



void salary() {
System.out.println("salary is "+salary);
}

class engineer extends employee  {

String calcsalary;


class Main {

public static void main (String[]args)  {

engineer e=new engineer();
e.display();
e.calcsalary();

System.out.println("the salary of engineer is 1000");
System.out.println("the salary of employee is 6000");
