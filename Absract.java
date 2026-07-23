abstract class Abstract {

public abstract void numberOfSides();
}

class Rectangle extends  Abstract(){
public void numberOfSides() {
System.out.println("rectangle is 4");
}
}

class Triangle extends Abstract(){
public void numberOfSides() {
System.out.println("triangle is 3");
}
}

class Hexagon extends Abstract(){
public void numberOfSides(){
System.out.println("hexagon is 6");
}
}

class Sides  {

public static void main(String[]args)  {


Rectangle r=new Rectangle();
Triangle t=new Triangle();
Hexagon h=new Hexagon();

r.numberOfSides();
t.numberOfSides();
h.numberOfSides();

}
}