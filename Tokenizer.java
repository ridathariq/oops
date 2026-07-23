import java.util.*;
import java.util.StringTokenizer;

class Tokenizer {

public static void main (String[]args)  {

int n;
int sum=0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter integers separated by space");
String str=sc.nextLine();

StringTokenizer st=new StringTokenizer(str, " ");

while(st.hasMoreTokens())  {
String temp=st.nextToken();
n=Integer.parseInt(temp);


System.out.println(n);
sum=sum+n;
}

System.out.println("sum of integers is" +sum);
sc.close();


}
}