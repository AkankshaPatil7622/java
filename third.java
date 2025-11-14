import java.util.ArrayList;
import java.util.Collections;

public class third {

    public static void main(String[] args) {
        // int arr[]=new int[6];
        // int arr[]={1,2,4,5,5};
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        // methods of ArrayList
        // 1. add(element)
        // 2. add(index,element)
        // 3. get(index)
        // 4. set(index,element)
        // 5. remove(index)
        // 6. size() returns no. of elementsin the list
        // 7. isEmpty() returns boolean
        // 8. clear() clear list
        // 9. contains() returns boolean value
        // 10. indexOf() index of first occurence of specified element
        // 11. toArray() return an array containing all elements in the list

        arr.add(7);
        System.out.println(arr);
        // arr.add(0, 12);
        // System.out.println(arr);
        // System.out.println(arr.set(0, 37));
        // System.out.println(arr.get(0));
        // System.out.println(arr);
        // System.out.println(arr.remove(0));
        // System.out.println(arr);
        // arr.clear();
        // System.out.println(arr);
        // System.out.println(arr.isEmpty());
        // System.out.println(arr.contains(12));
        arr.add(45);
        // System.out.println(arr.contains(45));
        // System.out.println(arr.toArray());

        arr.add(7);
        arr.add(12);
        arr.add(11);
        // System.out.println(arr);

        // for (int v : arr) {
        //     System.out.println(v);
        // }

        // Collections.sort(arr);
        // System.out.println(arr);

        arr1.add(3);
        arr1.add(4);
    //     System.out.println(arr1);
    //     Collections.copy(arr, arr1);
    //    System.out.println(arr);
       
       Collections.shuffle(arr);
       System.out.println(arr);
       Collections.reverse(arr);
       System.out.println(arr);
    


    }

}
