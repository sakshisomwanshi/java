/*2

Create an ArrayList which will be able to store only Strings. Create a printAll method which will print
all the elements using an Iterator.*/
import java.util.*;
public class assignment2 {
 static void printAll(ArrayList<String> list) {
Iterator<String> it = list.iterator();
for (String x : list) {
 while (it.hasNext()) {
  System.out.println(it.next());
            }


        }
    }
       
 public static void main(String[] args)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add("sakshi");

            list.add("prashant");
            list.add("shweta");
            list.add("Legion");
            printAll(list);
        }

}
