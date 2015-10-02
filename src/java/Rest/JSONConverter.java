/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import Backend.Person;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;
import static javax.ws.rs.client.Entity.json;

/**
 *
 * @author Sindt
 */
public class JSONConverter {

    private static Gson gson = new Gson();

    public static Person getPersonFromJson(String js) {
        return null;
    }

    public static String getJSONFromPerson(Person p) {
        Person person = p;
        JsonObject response = new JsonObject();
        String json = gson.toJson(person);
        response.addProperty("person", json);
        return json;

    }

    public static String getJSONFromPerson(List<Person> persons) {
        return null;
    }
}
