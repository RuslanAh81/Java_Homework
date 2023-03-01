package Task1;
import java.sql.SQLOutput;
import java.util.*;

public class Phonebook {
    private Map<String, List<String>> conts = new HashMap<>();

    void add(String name, String phnums) {
        if (conts.containsKey(name)) {
            conts.get(name).add(phnums);
        }
        else {
            ArrayList<String> phoneList = new ArrayList<String>();
            phoneList.add(phnums);
            conts.put(name, phoneList);
        }
    }

    void showContacts(String name) {
           System.out.println(name + ":");
           int count = 0;
           for (String number: conts.get(name)) {
               System.out.printf("\t%d. %s\n", ++count, number);
           }
    }

    void showAllCont() {

        for (String name : conts.keySet()) {
            System.out.printf("Контакт %s\n", name);
            int count = 0;
            for (String number : conts.get(name)) {
                System.out.printf("\t%d.Номер телефона: %s\n",++count, number);
            }
        }
    }

}
