import java.util.*;
class words_seperated_by_dots{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c,x,y,i=1;
String s;
s=sc.next();
a=s.length();
b=sc.nextInt();

y=b;
while(b!=0)
{
b=b/10;
i++;
}
x=30-a-i;
System.out.print(s);

for(int j=0;j<=x;j++)

{
System.out.print(".");
}
System.out.print(y);
}
}