class Test{

void add(int x,int y){

System.out.println("int addition");
System.out.println(x+y);
}

void add(float x,float y){

System.out.println("float addition");
System.out.println(x+y);
}
}
class overloading1{
public static void main(String arg[]){
Test t1=new Test();
t1.add(1.2f,2.3f);
t1.add(100,200);
}
}
