import java.util.*;
class order_checker{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int bolts,nut,washer;
System.out.println("enter bolts,nut,washer");
bolts=sc.nextInt();
nut=sc.nextInt();
washer=sc.nextInt();
if (bolts==nut && washer>=2*bolts)
{
System.out.println("all is ok");
}
else if(bolts>nut && washer==2*bolts){
System.out.println("nuts are few");
}
else if(bolts<nut && washer==2*bolts){
System.out.println("bolts are few");
}
else
{
System.out.println("error occured");
}
int total;
total=bolts*5+nut*3+washer*1;
System.out.println("total is"+total);
}
}

