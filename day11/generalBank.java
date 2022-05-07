abstract class GeneralBank1{
abstract void getsavingInterestRate(float p,float n,float r);
abstract void getFixedInterestRate(float p,float n,float r);
}


class ICICIBank extends GeneralBank1 {
@Override
void getsavingInterestRate(float p,float n,float r){
System.out.println("rate of interest is"+p*r*n/100);

}
@Override
void getFixedInterestRate(float p,float n,float r){
System.out.println("rate of interest is"+p*r*n/100);
}
}
class KOTMBank extends GeneralBank1{
@Override
 void getsavingInterestRate(float p,float n,float r){
System.out.println("rate of interest is"+p*r*n/100);

}
@Override
void getFixedInterestRate(float p,float n,float r){
System.out.println("rate of interest is"+p*r*n/100);
}
}
class generalBank{
public static void main(String[] args){
ICICIBank i1=new ICICIBank();
KOTMBank k1=new KOTMBank();
GeneralBank1 g1;

g1=new ICICIBank();
g1.getsavingInterestRate(1000f,4f,2f);
g1.getFixedInterestRate(1000f,8.5f,2f);

g1=new KOTMBank();
g1.getsavingInterestRate(1000f,6f,2f);
g1.getFixedInterestRate(1000f,9f,2f);


i1.getsavingInterestRate(1000f,4f,2f);
i1.getFixedInterestRate(1000f,8.5f,2f);

k1.getsavingInterestRate(1000f,6f,2f);
k1.getFixedInterestRate(1000f,9f,2f);
}
}



