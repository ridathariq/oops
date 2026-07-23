class display  {

public synchronized void print(String msg){
System.out.println("["+msg);

try {
Thread.sleep(1000);
}
catch(ArithmeticException e)  {
System.out.println(e.getMessage());
}
System.out.println("]");

}}

class threadss extends Thread  {
private display d;
private String msg;

public threadss(display d, String msg) {
this.d=d;
this.msg=msg;
}
public void run() {
d.print(msg);
}
}

class Synthread {


public static void main(String[]args)  {
display d=new display();
threadss t1=new threadss(d,"hello");
threadss t2=new threadss(d,"world");

t1.start();
t2.start();

}
}



