import java.util.*;
class neg_positive_zero{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter numbers");
a=sc.nextInt();


if(a>0)
{
System.out.println("a is positive");
}
else if(a<0)
{
System.out.println("a is negetive");
}
else
{
System.out.println("a is zero");
}
}
}