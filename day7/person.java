class person1{
String member;
person1(){
member="sakshi";
System.out.println(member);
}
}

class Employee extends person{
double ann_sal;
int year;
String nat_insnum;
Employee(){
ann_sal=212.343;
year=2019;
nat_insnum="12345";
System.out.println(ann_sal);
System.out.println(year);
System.out.println(nat_insnum);
}
}

class person{
public static void main(String[] args){
Employee ob=new Employee();

}
}






