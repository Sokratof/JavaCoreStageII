package HW4_Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Handbook {
    private HashMap<String, HashSet<String>> handbook= new HashMap<>();

    public void addElement(String surname, String phone) {
        HashSet<String> phones;
        if (handbook.containsKey(surname)){
            phones = handbook.get(surname);
        }
        else {
            phones = new HashSet<>();
        }
        phones.add(phone.replaceAll(" ", " "));
        handbook.put(surname, phones);
    }
    public Set<String> getPhones(String surname){
        return handbook.get(surname);
    }
}
