import java.util.*;
class steam_engine_efficiency{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter temprature of air and steam");

double tair,tsteam,efficiency;

tair=sc.nextDouble();
tsteam=sc.nextDouble();
efficiency=1-(tair/tsteam);
if(tair>300 && tsteam<373)
{
System.out.println(efficiency);
}
else
{
System.out.println("efficiency is zero");
}
}
}

 

