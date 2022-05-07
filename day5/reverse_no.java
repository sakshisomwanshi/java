import java.util.*;
class reverse_no{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
int[] arr=new int[n];

System.out.println("enter your array");

for(i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(i=arr.length-1;i>0;i--)
{
System.out.println(arr[i]);
}
}
}