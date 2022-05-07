import java.util.*;
class leap_year{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter number");
a=sc.nextInt();


if(a%100==0 && a%4==0)
{
System.out.println("leap year");
}

else
{
System.out.println("not a leap year");
}
}
}