import java.util.*;

class Frequency {

public static void main(String[]args) {

Scanner sc=new Scanner(System.in);

System.out.println("enter string");
String str=sc.nextLine();



int len=str.length();



System.out.println("enter character to count");
char ch=sc.nextLine().charAt(0);

int count=0;

for(int i=0;i<len;i++)  {
if (str.charAt(i)==ch) {

count=count+1;


}
}

System.out.println("frequency of character " +ch+ " is " + count);

}
}