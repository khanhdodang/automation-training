package basics.JavaObjectJSON;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertJavaObjectToJson2 {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = newPerson();
        String jsonString = gson.toJson(person);
        System.out.println(jsonString);
    }

    private static Person newPerson() {
        Person person = new Person();

        List<String> hobbies = new ArrayList<>();
        hobbies.add("Football");
        hobbies.add("Cooking");
        hobbies.add("Swimming");

        Map<String, String> languages = new HashMap<>();
        languages.put("French", "Beginner");
        languages.put("German", "Intermediate");
        languages.put("Spanish", "Advanced");

        person.setName("David");
        person.setAge(30);
        person.setHobbies(hobbies);
        person.setLanguages(languages);

        return person;
    }
}
