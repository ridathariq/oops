import java.util.*;

class Rev {
public static void main(String[]args)  {

Scanner sc=new Scanner(System.in);

System.out.println("enter string");
String str=sc.nextLine();

int len=str.length();

for(int i=len-1;i>=0;i--)  {
String rev=rev+str.charAt(i);

System.out.println(rev);
}
}
}