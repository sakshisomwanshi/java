import java.util.*;
class store_element{
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
for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}




