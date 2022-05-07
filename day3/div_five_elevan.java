import java.util.*;
class div_five_elevan{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter numbers");
a=sc.nextInt();


if(a%5==0)
{
System.out.println("divisable by 5");
}
else if(a%11==0)
{
System.out.println("divisable by 11");
}
else
{
System.out.println("not divisible");
}
}
}