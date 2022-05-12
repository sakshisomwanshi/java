class person{
String First_name;
String Last_name;

person1(String First_name,String Last_name){
this.First_name=First_name;
this.Last_name=Last_name;
}
public void getFirst_name(){
System.out.println(First_name);
}
public void getLast_name(){
System.out.println(Last_name);
}



}
class teacher extends person{
double salary;
int year;
int experience;
public double setSalary(double salary){
this.salary=salary;

}
public int setYear( int year){
this.year=year;

}
public int setExperience(int Experience){
this.experience=experience;

}
public void double setSalary(double salary){
this.salary=salary;



class person1{
public static void main(String[] args){
person p1=new person("saksi somwanshi");

p1.getFirst_name();
p1.getLast_name();

teacher t1=new teacher(45000,2000,5);
t1.getSalary();
t1.getYear();
t1.getExperience();
}
}

