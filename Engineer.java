class employee  {

void display(){
System.out.println("name is hi");

}void salary() {
System.out.println("salary ias 3000");
}
}

class engineer extends employee  {

void salary() {
System.out.println("salary of engineer is 4000");
super.salary();
}
}


class Engineer {

public static void main (String[]args)  {

engineer e=new engineer();
e.display();
e.salary();

}
}
