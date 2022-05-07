import java.util.*;
class microwave_oven{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double tempheat,no_items,sec,min;
tempheat=sc.nextDouble();
no_items=sc.nextDouble();
if(no_items==1)
{
sec=tempheat%100;
min=tempheat/100;
System.out.println("minute"+min);
System.out.println("second"+sec);
}else if(no_items==2)
{
tempheat=tempheat*1.5f;
sec=tempheat%100;
min=tempheat/100;
System.out.println("minute"+min);
System.out.println("second"+sec);
}
else if(no_items==3)
{
tempheat=tempheat*2;
sec=tempheat%100;
min=tempheat/100;
System.out.println("minute"+min);
System.out.println("second"+sec);
}
}
}




