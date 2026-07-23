import java.util.*;

public class Catch {

public static void main(String[]args)  {

Scanner sc=new Scanner(System.in);
try{


System.out.println("enter no a");
int a=sc.nextInt();


System.out.println("enter no b");
int b=sc.nextInt();


if(b==0)  {
throw new ArithmeticException("cannot by zero");
}

int c=a/b;
System.out.println("result" +c);

}

catch (ArithmeticException e) {

System.out.println(e.getMessage());
}

finally {

System.out.println("end");
}

}
}