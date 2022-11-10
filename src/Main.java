import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        String[] wordSetArray = {"apple", "orange", "banana", "pear", "orange", "apple", "cherry", "lemon", "strawberry", "strawberry"};

        for (int i = 0; i < wordSetArray.length; i++) {
            if (map.containsKey(wordSetArray[i]))
                map.put(wordSetArray[i], map.get(wordSetArray[i]) + 1);
            else
                map.put(wordSetArray[i], 1);
        }
        System.out.println(map);

        Phonebook phonebook = new Phonebook();

        phonebook.add("Danilov", "89248564587");
        phonebook.add("Danilov", "89571253654");
        phonebook.add("Ivanov", "89187598562");
        phonebook.add("Ivanov", "89675892555");
        phonebook.add("Petrov", "89142567414");

        System.out.println(phonebook.get("Danilov"));
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Artemchenko"));

    }
}
