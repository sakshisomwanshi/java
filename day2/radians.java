import java.util.*;
public class radians
{
public static void main(String args[])
{
double rad,degree;
Scanner sc=new Scanner(System.in);
degree=sc.nextDouble();
rad=degree*Math.PI/180.0f;
System.out.println("Radian is"+rad);
}
}