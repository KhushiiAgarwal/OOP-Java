import java.util.*;
class Duplicacy{
   public static <T> ArrayList <T> removeDuplicates (ArrayList<T> list){
    ArrayList<T> newList = new ArrayList<T>(); 
    for(T elements: list)
        if(!newList.contains(elements)){
            newList.add(elements);
    }
    return newList;
    }
   public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(10, 20, 10, 15,40,15,40   )); 
        System.out.println("Original List"+list);
        ArrayList<Integer> newList = removeDuplicates(list); 
        System.out.println("Unique Elements List: "+newList);


    }
}
