import java.util.*;
import java.util.stream.Collectors;


public class list {
   
    public static void main(String[] args)  {
        List<Object> l1 = new LinkedList<Object> ();
        List<Object> l2 = new LinkedList<Object>();
        l1.add("Hello");
        l1.add(102);
        l1.add(200.8);
        l1.add(25);
    
        l2.add("150");
        l2.add("40.8");
        l2.add("Welcome");
        l2.add("A");        
        for(int i=3;i>-1;i--){
            l1.add(l2.get(i));
        }
        System.out.println(l1);
    }
}
