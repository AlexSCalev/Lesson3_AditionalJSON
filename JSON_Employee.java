package JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSON_Employee {


    public void bublicOneEmployee(String awayToFile, String awayToCreate1, String awayToCreate2) {
        JSONreader inputDate = new JSONreader();
        inputDate.bublicReadJSON(awayToFile);
        if (inputDate.employees1 == null | inputDate.employees2 == null) {
            throw new IllegalArgumentException("You input incorrect date");
        }
        try {
//            Add Date employees1
            FileWriter file = new FileWriter(awayToCreate1);
            file.write(inputDate.employees1.toJSONString());
            file.flush();
//            Add Date employees2
            file = new FileWriter(awayToCreate2);
            file.write(inputDate.employees2.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
