package JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONreader {
    JSONObject employees1;
    JSONObject employees2;

    @SuppressWarnings("unchecked")
    public void bublicReadJSON(String awayToFile) {
        JSONParser jsonParser = new JSONParser();

        try {

            FileReader reader = new FileReader(awayToFile);
            Object obj = jsonParser.parse(reader);
            JSONArray employeesList = (JSONArray) obj;
            JSONObject doc = (JSONObject) employeesList.get(0);
//            Show Departaments 1
            JSONObject Department1 = (JSONObject) doc.get("Company");
//            Show Departaments 2
            JSONObject Department2 = (JSONObject) doc.get("Company");

//            Show Employees
            JSONObject employee1 = (JSONObject) Department1.get("Departament1");
            JSONObject employee2 = (JSONObject) Department2.get("Departamen2");
//            To be continued

            employees2 = (JSONObject) employee1.get("employee");
            employees1 = (JSONObject) employee2.get("employee");
//            Show Date in employees 1s
            showEmployeeDate(employees2);
            showEmployeeDate(employees1);
//            showEmployeeDate();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    private void showEmployeeDate(JSONObject employees) {
        System.out.println("empId := " + employees.get("empId"));
        System.out.println("last name := " + employees.get("lastName"));
        System.out.println("First name := " + employees.get("firstName"));
        System.out.println("Birth Date := " + employees.get("brithDate"));
        System.out.println("Position := " + employees.get("position"));
        JSONObject skills = (JSONObject) employees.get("skills");
        for (int i = 1; i <= skills.size(); i++) {
            System.out.println(skills.get("skill" + i));
        }
        System.out.println("managerId := " + employees.get("managerId"));
        System.out.println("------------------------------------------");
    }
}
