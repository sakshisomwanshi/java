class A{
int i;
A(){
i=10;
System.out.println("in A");
}
}
class B extends A{
int i;
B(){
i=20;
System.out.println("in B");
}
void add(){
System.out.println(super.i+i);
}
}
class inheritance1{
public static void main(String arg[]){
B ob=new B();
ob.add();
}
}




