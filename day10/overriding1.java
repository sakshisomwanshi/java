//what is overriding
class A{
void show(){
System.out.println("In A");
}
}
class B extends A{
void show(){
System.out.println("In B");
+}
}
public class overriding1{
public static void main(String[] args){
B ob=new B();
ob.show();
}
}

