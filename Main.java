package JSON;

public class Main {
    public static void main(String[] args) {
//        Indicate away to where file want parsing "C:\\awayToFIle\\nameFile.json"
        new JSONwriter().bublicCreateJSON("C:\\Users\\Alexandr\\Desktop\\Testing\\employees.json");
//        Indicate away to where file want for ReadJSONFILE "C:\\awayToFIle\\nameFile.json"
        new JSONreader().bublicReadJSON("C:\\Users\\Alexandr\\Desktop\\Testing\\employees.json");
//        Indicate away to where file Read file and indicate Where create file
        new JSON_Employee().bublicOneEmployee("C:\\Users\\Alexandr\\Desktop\\Testing\\employees.json",
                "C:\\Users\\Alexandr\\Desktop\\Testing\\employ1.json",
                "C:\\Users\\Alexandr\\Desktop\\Testing\\employ2.json");
    }
}
