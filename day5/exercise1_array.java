import java.util.*;
class exercise1_array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,sum=0;
n=sc.nextInt();
int[] arr=new int[n];

System.out.println("enter your array");

for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<arr.length;i++)
{
sum=sum+arr[i];
System.out.println("addition is"+sum);
}
}
}