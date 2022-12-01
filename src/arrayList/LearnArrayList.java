package arrayList;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentsNames = new ArrayList<String>();
        studentsNames.add("Rohan");
        studentsNames.add("jane");
        studentsNames.add("Ron");
        studentsNames.add("Ran");
        studentsNames.add("ban");
        studentsNames.add("ratan");
        System.out.println(studentsNames);
        studentsNames.add(1,"john");
        System.out.println(studentsNames);


    }
}
