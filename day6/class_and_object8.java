class complexNumber{
    double real,imaginary,add;
    
             complexNumber(double r,double i){
             this.real=r;
             this.img=i;
             }
             complexNumber add(complexNumber c1,complexNumber c2);
             complexNumber add=new complexNumber(0,0);
             add.real = c1.real+c2.real;
             add.img = c1.img+c2.img;
             return add;
             }
             
             class class_and_object8
{
public static void main(String arg[]){
complexNumber c1=new (5.5,4);
complexNumber c2=new (1.2,3.4);
complexNumber add=sum(c1,c2);
 System.out.println("sum is"+add.real "+"+add.img+"i");
 


}

