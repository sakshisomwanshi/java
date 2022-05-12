class Armstrong_no{
public static void main (String args[]){
int a,b;
int p,q,r,s;
int k;

for(a=100;a<=999;a++){


p=a%10;
q=a%100;
r=q/10;
s=a/100;

k=p*p*p+r*r*r*+s*s*s;
if(a==k){
System.out.println(k);
}
}
}
}


