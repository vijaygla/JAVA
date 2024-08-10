import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        // add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get elements
        int element=list.get(1);
        System.out.println(element);

        // to add ekement in between 
        list.add(2,5);
        System.out.println(list);

        // set element 
        list.set(0, 9);
        System.out.println(list);

        // delete element 
        list.remove(2);
        System.out.println(list);

        // size
        int size =list.size();
        System.out.println("Size="+size);

        // loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}
