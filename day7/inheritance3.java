class A{

void show(){

System.out.println("in Base");
}
}
class B extends A{

void disp(){

System.out.println("in Derived");
}
}
class inheritance3{
public static void main(String arg[]){
B ob=new B();
ob.show();
ob.disp();
}
}

