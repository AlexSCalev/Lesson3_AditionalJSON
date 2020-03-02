package JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONwriter {
    @SuppressWarnings("unchecked")
    public void bublicCreateJSON(String awayToCreate) {

        JSONObject employeeDetails = new JSONObject();
        JSONObject employeeDetailsSkill = new JSONObject();
        employeeDetails.put("empId", "001");
        employeeDetails.put("lastName", "lastName");
        employeeDetails.put("firstName", "Firstname");
        employeeDetails.put("brithDate", "01.01.2000");
        employeeDetails.put("position", "Department Manager");
        employeeDetailsSkill.put("skill1", "comunucation");
        employeeDetailsSkill.put("skill2", "java");
        employeeDetails.put("skills", employeeDetailsSkill);
        employeeDetails.put("managerId", "0");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);


//        Add employee number 2
        JSONObject employeeDetails1 = new JSONObject();
        JSONObject employeeDetailsSkill1 = new JSONObject();
        employeeDetails1.put("empId", "002");
        employeeDetails1.put("lastName", "lastName2");
        employeeDetails1.put("firstName", "Firstname2");
        employeeDetails1.put("brithDate", "01.01.2001");
        employeeDetails1.put("position", "Developer");
        employeeDetailsSkill1.put("skill1", "Sleeps only 2 hours per day");
        employeeDetailsSkill1.put("skill2", "Overtimes without concerns");
        employeeDetailsSkill1.put("skill3", "Works for food");
        employeeDetails1.put("skills", employeeDetailsSkill1);
        employeeDetails1.put("managerId", "001");

        JSONObject employeeObjecet1 = new JSONObject();
        employeeObjecet1.put("employee", employeeDetails1);

        JSONObject departament = new JSONObject();
        departament.put("Departamen2", employeeObject);
        departament.put("Departament1", employeeObjecet1);

        JSONObject company = new JSONObject();
        company.put("Company", departament);
        JSONArray employeeList = new JSONArray();
        employeeList.add(company);
        try {
            FileWriter file = new FileWriter(awayToCreate);
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
