import java.util.*;
class feet_to_inches{
public static void main(String args[]){
double feet,inches,meter;
Scanner sc=new Scanner(System.in);
System.out.println("enter meter");
meter=sc.nextDouble();
feet=3.28084 * meter;
inches=39.37 *meter;
System.out.println("feet is"+feet);
System.out.println("inches is"+inches);
}
}
