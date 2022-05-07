class Address{
int housenum;
String areaname;
String city;
//getter and setter
public void sethousenum(int housenum){
this.housenum=housenum;
}
public void setAreaname(String areaname){
this.areaname=areaname;
}
public void setCity(String city){
this.city=city;
}
public int getHousenum(){
return housenum;
}
public String getAreaname(){
return areaname;
}
public String getCity(){
return city;
}
}
class student{
int id;
String name;
Address adr;
 void setId(int id){
this.id=id;
}
 void setAdr(Address adr){
this.adr=adr;
}
 int getId(){
return id;
}
 String getAdr(){
return adr;
}
}
class address_student{
public static void main(String[] args){
address ad=new address();
ad.setHousenum(10);
ad.setAreaName("abc");
ad.setcity("aurangabad");
student st=new student();
int x=101;
st.setId(x);
st.setadr(ad);
st.setName("xyz");
//read values
int id1;
id1=st.getId();
String n;
n=st.getAdr();
//read address and object values
int hn;
hn=ad1.getHousenum();
String Area;
Area=ad1.getAreaName();
String city=ad1.getcity();
}
}






