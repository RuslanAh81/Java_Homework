import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.*;

public class Task1{
    public static void main(String[] args) throws ParseException, IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметр поиска (city, name, age):");
        String a = sc.next();

        JSONParser parser = new JSONParser();

        String fileName = "example.json";
        FileReader reader = new FileReader(fileName);

        JSONObject obj =(JSONObject) parser.parse(reader);
        String val= (String)obj.get(a);
        if(val.equals("null")){
            System.out.println("Параметр не обнаружен");
        }
        else {

            StringBuilder sb = new StringBuilder("SELECT* FROM students WHERE " + a + " = ");

            switch (a) {
                case "name":

                    System.out.println(sb.append(val));
                    break;
                case "city":
                    System.out.println(sb.append(val));
                    break;

                case "age":
                    System.out.println(sb.append(val));
                    break;
                default:
                    System.out.println("Параметр не обнаруженнн ");
            }
        }
    }
}