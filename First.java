class First {



public static void main (String[]args)  {
Second s=new Second();
s.displaySecond();
}}


class Second {

void displaySecond()  {
Third t=new Third();
t.displayThird();
}
}

class Third {

void displayThird()  {

System.out.println("no way home");


}
}
