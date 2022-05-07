import java.util.*;
class town_dump{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int dispose,charge;
System.out.println("enter load trash");
dispose=sc.nextInt();
if (dispose<200)
{
charge=20;
System.out.println("charge is"+charge);
}
else if(dispose>200){
int x;
x=dispose/100;
x=x-2;
charge=20+x*8;
System.out.println("charge is"+charge);
}
}
}








