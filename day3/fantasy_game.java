import java.util.*;
class fantasy_game{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int strength,health,luck,total;
strength=sc.nextInt();
health=sc.nextInt();
luck=sc.nextInt();
total=strength+health+luck;
if(total<15)
{
System.out.println("strength"+strength);
System.out.println("health"+health);
System.out.println("luck"+luck);
}
else
{
strength=5;
health=5;
luck=5;
System.out.println("strength"+strength);
System.out.println("health"+health);
System.out.println("luck"+luck);
}
}
}