import java.util.*;
class last_chance_gas{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int bolts,nut,washer;
System.out.println("enter bolts,nut,washer");
bolts=sc.nextInt();
nut=sc.nextInt();
washer=sc.nextInt();
if (bolts==nut && washer==2*bolts)
{
System.out.println("all is ok");
}
else if(bolts>nut && washer==2*bolts){
System.out.println("nuts are few");
