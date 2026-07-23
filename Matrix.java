import java.util.*;

class Matrix {

public static void main(String[]args)  {

Scanner sc=new Scanner(System.in);

System.out.println("enter rows of matrix m1");
int m1=sc.nextInt();
System.out.println("enter colum of matrix n1");
int n1=sc.nextInt();
System.out.println("enter rows of matrix m2");
int m2=sc.nextInt();
System.out.println("entercolum of matrix n2");
int n2=sc.nextInt();

if (n1!=m2)  {
System.out.println("not possible");

return;
}

int a[][]=new int[m1][n1];
int b[][]=new int[m2][n2];
int c[][]=new int[m1][n2];

System.out.println("enter matrix a");

for(int i=0;i<m1;i++) {
for(int j=0;j<n1;j++) {
System.out.println("a["+i+" "+j+"]=");
a[i][j]=sc.nextInt();
}
}


System.out.println("enter matrix b");
for(int i=0;i<m2;i++) {
for(int j=0;j<n2;j++) {
System.out.println("b["+i+" "+j+"]=");
b[i][j]=sc.nextInt();
}
}




for(int i=0;i<m1;i++) {
for(int j=0;j<n2;j++) {

c[i][j]=0;


for( int k=0;k<n1;k++) {
c[i][j]+=a[i][k]*b[k][j];
}
}
}


System.out.println("matrix a");
for(int i=0;i<m1;i++) {
for(int j=0;j<n1;j++) {
System.out.println(a[i][j]+" ");
}
System.out.println();
}

System.out.println("matrix b");
for(int i=0;i<m2;i++) {
for(int j=0;j<n2;j++) {
System.out.println(b[i][j]+" ");
}
System.out.println();
}


System.out.println("matrix c");
for(int i=0;i<m1;i++) {
for(int j=0;j<n2;j++) {
System.out.println(c[i][j]+" ");
}
System.out.println();
}
}
}






























