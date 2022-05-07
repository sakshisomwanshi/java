import java.util.*;
class sum_of_sequential_integer{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,sum=0;
a=sc.nextInt();
b=sc.nextInt();


for(int i=a;i<=b;i++)
sum+=i;
{
System.out.println("sum of integer"+sum);
}
}
}