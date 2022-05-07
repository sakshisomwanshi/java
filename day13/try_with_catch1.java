//try with catch
import java.util.*;
public class try_with_catch1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter 2 number");
a=sc.nextInt();
b=sc.nextInt();
try{
c=a/b;
System.out.println("division is"+ c);
}
catch(ArithmeticException e){
System.out.println("can not divide by zero");
}
System.out.println("end");
}
}





