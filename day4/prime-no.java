import java.util.*;
class prime_no{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i=1;
n=sc.nextInt();

while(i<n){
i++;
if(n%i==0)
break;
}

if(n==i)
{
System.out.println("prime");
}

else
{
System.out.println(" non prime");
}
}
}








