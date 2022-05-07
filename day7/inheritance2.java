class A{

A(){

System.out.println("in A");
}
}
class B extends A{

B(){

System.out.println("in B");
}
}
class C extends B{
C(){
System.out.println("in C");
}
}
class inheritance2{
public static void main(String arg[]){
C ob=new C();

}
}




