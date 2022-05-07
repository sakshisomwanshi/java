import java.util.*;
abstract class instrument{
abstract void play();
}
class piano extends instrument {
void play(){
System.out.println("piano is playing tan tan tan");

}
}

class flute extends instrument {
void play(){
System.out.println("flute is playing toot toot toot ");

}
}

class guitar extends instrument{
void play(){
System.out.println("guitar is playing tin tin tin ");

}
}

class Instrument{
public static void main(String[] args){

instrument[] arr;
arr=new instrument[3]; 
arr[0]=new piano();
arr[1]=new flute();
arr[2]=new guitar();
Scanner sc=new Scanner(System.in);
int i;
System.out.println("enter index from 0 to 2 ");
i=sc.nextInt();
if(

case 1:
c1=new piano();
c1.play();
break;
case 2:
c1=new flute();
c1.play();
break;

case 3:
c1=new guitar();
c1.play();
break;

default:
System.out.println("put a proper input");
break;
}
}

}
