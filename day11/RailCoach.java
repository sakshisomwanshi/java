import java.util.*;
abstract class compartement{
abstract void notice();
}
class First extends compartement {
void notice(){
System.out.println("this is first class");
}
}
class Ladies extends compartement{
void notice(){
System.out.println("this is ladies class");

}
}
class General extends compartement{
void notice(){
System.out.println("this is general class");

}
}
class Luggage extends compartement{
void notice(){
System.out.println("this is luggage class");

}
}
class RailCoach{
public static void main(String[] args){
int i;
compartement c1;

Scanner sc=new Scanner(System.in);
i=sc.nextInt();
switch(i){

case 1:
c1=new First();
c1.notice();
break;
case 2:
c1=new Ladies();
c1.notice();
break;

case 3:
c1=new General();
c1.notice();
break;

case 4:
c1=new Luggage();
c1.notice();
break;
default:
System.out.println("put a proper input");
break;
}
}

}