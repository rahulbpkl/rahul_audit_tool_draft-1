import java.util.Arrays;
import java.util.List;

public class Enhanced {
public static void main(String args[]){

List<Integer> list = (List) Arrays.asList(new Integer[] {13, 14, 15});
boolean first = true;
 
System.out.println("Processing list...");
for (Integer in: list) {
  if (first) {
    first = false;
    in = new Integer(99);
  }
  System.out.println(" New item: " + i);
  // Process i
}
 
System.out.println("Modified list?");
for (Integer i: list) {
 
  System.out.println("List item: " + i);
}
}
}
