import java.util.*;

class Freq {
public static void main(String[]args)  {
int count=0;
Scanner sc=new Scanner(System.in);

System.out.println("enter string");
String str=sc.nextLine();

int len=str.length();
System.out.println("enter character");
char ch=sc.nextLine().charAt(0);




for(int i=0;i<len;i++)  {
if(str.charAt(i)==ch) {
count ++;

}
}

System.out.println("count occurs"+ch+"in"+count);
}
}