import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
       /* List<String> students = new ArrayList<>();
        students.add("rohan");
        System.out.println(students);
        students.add(0,"ratan");
        System.out.println(students);

        List<String> newStudents = new ArrayList<>();
        newStudents.add("Ram");
        newStudents.add("Shaym");

        students.addAll(newStudents);
        System.out.println(students);
        System.out.println(students.get(students.size()-1));*/

        // remove function
            List<Integer> list = new ArrayList<>();
        {
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);
            list.add(90);

            System.out.println(list);

            for (Integer element : list) {
                System.out.println(" Elements " + element);

            }

            Iterator<Integer> it = list.iterator();

            while(it.hasNext()){
                System.out.println("iterator" + it.next());


            }






            /*//remove  element from that index
            list.remove(1);
            System.out.println(list);
            //remove the element of that value
            list.remove(Integer.valueOf(30));
            System.out.println(list);*/

            //setting value
           /* list.set(2, 1000);*/
            /*System.out.println(list);

            System.out.println(list.contains(10));*/

        }

    }
}
