class Test implements Runnable{
Thread t;
Test(){
t=new Thread(this);
t.start();
}
@Override
public void run(){
try{
for(int i=0;i<5;i++){
System.out.println("Child Thread"+i);
Thread.sleep(500);
}
}catch(Exception e){
}
}
}
public class runnable1{
public static void main(String[]args){
Test t1=new Test();
try{
for(int i=0;i<5;i++){
System.out.println("main Thread"+i);
Thread.sleep(1000);
}
}catch(InterruptedException e){
}
}
}