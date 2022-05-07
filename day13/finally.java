import java.io.FileInputStream;
//finally block
class finally1{
static void div1(){
try{
int a;
a=10/0;
}
catch(ArithmeticException e){
System.out.println("can not divide by zero");
}
finally{
System.out.println("Always Executed");
}
}
static void div2(){
try{
int a;
a=10/2;
}
catch(ArithmeticException e){
System.out.println("can not divide by zero");
}
finally{
System.out.println("Always Executed");
}
}
static void div3(){
try{

return;
}
catch(ArithmeticException e){
System.out.println("can not divide by zero");
}
finally{
System.out.println("Always Executed");
}
}
public static void main(String[] args){
div1();
div2();

div3();
}
}





