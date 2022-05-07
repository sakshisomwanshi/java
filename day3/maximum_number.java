import java.util.*;
class maximum_number{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c,max;
System.out.println("enter 3 numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b)
{
System.out.println("a is max");
}
else if(b>a)
{
System.out.println("b is max");
}
else
{
System.out.println("c is max");
}
}
}