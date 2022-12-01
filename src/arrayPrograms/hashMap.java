package arrayPrograms;
import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        HashMap<String,String> nameEmails = new HashMap<String,String>();
        // add  key and value pair
        nameEmails.put("rohan","rohanpraveen22@gmail.com");
        nameEmails.put("ratan","ratan81991@gmail.com");
        nameEmails.put("praveen","praveen22@gmail.com");

        //System.out.println(nameEmails);
            //remove name
        //nameEmails.remove("rohan");
        //System.out.println(nameEmails);

        // find the email of x person
        //nameEmails.clear();
        for(String i : nameEmails.keySet()){
            System.out.print(i + "\t" + " = ");
            System.out.println(nameEmails.get(i));
        }




    }

}
