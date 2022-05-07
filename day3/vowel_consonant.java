import java.util.*;
class vowel_consonant{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s;
char a;
s=sc.next();
a=s.charAt(0);
if(a=='a' || a=='e' ||a=='i'||a=='o'||a=='u')
{
System.out.println("vowels");
}

else
{
System.out.println("consonant");
}
}
}