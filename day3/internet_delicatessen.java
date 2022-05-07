import java.util.*;
class internet_delicatessen{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

double a,regular=2,express=3,delivary;
a=sc.nextDouble();

if (a<10)
{
delivary=regular+express;
System.out.println("delivary"+delivary);
System.out.println("total"+(delivary+a));
}
else{
delivary=express;
System.out.println("delivary"+delivary);
System.out.println("total"+(delivary+a));
}
}
}



