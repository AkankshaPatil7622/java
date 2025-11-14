import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class four 
{
    public static void main(String args[])
    {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(34);
      list.add(23);
      list.add(90);
      list.add(56);
      list.add(76);
      for(int i=0;i<list.size();i++)
      {
        System.out.println(list.get(i));
      }

      Collections.sort(list);
      System.out.println(list);

      Collections.reverse(list);
      System.out.println(list);

      List<Integer> list2=list.subList(2, 4);
      System.out.println(list2);
      list2.add(45);
      list2.add(89);
      list2.add(67);
      System.out.println(list2);
      Collections.swap(list2, 0, 3);
      System.out.println(list2);

      System.out.println("after joning :");
      List<Integer> list3= new ArrayList<>();
      list3.addAll(list);
      list3.addAll(list2);
      System.out.println(list3);

      list3=(ArrayList)list.clone();
      System.out.println(list3);

      list.trimToSize();
      
      System.out.println(list);

      list.ensureCapacity(12);
      System.out.println(list.size());

    }
  }
