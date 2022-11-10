import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 public class Phonebook {
        private Map<String, List<String>> phonebook = new HashMap<>();
        private List <String> number_list;

        public void add (String surname, String number){

            if(phonebook.containsKey(surname)){
                number_list = phonebook.get(surname);
                number_list.add(number);
                phonebook.put(surname, number_list);
            } else {
                number_list = new ArrayList<>();
                number_list.add(number);
                phonebook.put(surname, number_list);
            }
        }

        public List<String> get(String surname) {
            return phonebook.get(surname);
        }

    }
