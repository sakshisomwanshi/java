class room{
      float l,b,h;
       
      void setInfo( float x,  float y, float z ){                                                                           
         l=x;
        b=y;
        h=z;
       }
     void getInfo(){
      System.out.println(l);
      System.out.println(b);
      System.out.println(h);
      }
        void getVolume(){
     float vol=l*b*h;
      System.out.println(vol);;
    }
         
}
class class_and_object2{
public static void main(String arg[])
{
   room p1=new  room();
    room p2=new  room();
     p1.setInfo(1.2f,1.2f,1.2f);
      p2.setInfo(1.3f,1.3f,1.3f);

    p1.getVolume();
    p2.getVolume();
  
}
}