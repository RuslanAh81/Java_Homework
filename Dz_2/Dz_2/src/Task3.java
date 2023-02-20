import org.json.simple.parser.ParseException;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.file.Files.readString;
import static javax.swing.UIManager.getString;

public class Task3{
    public static void main(String[] args) throws IOException, ParseException {
        String file = readString(Paths.get("example3.json"));
        String result = getString(file);
        System.out.println(result);
    }

    private static String getString(String file) {
        Gson gson = new Gson();
        Student[] students = gson.fromJson(file, Student[].class);
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append("Студент ");
            sb.append(student.surname);
            sb.append(" получил ");
            sb.append(student.mark);
            sb.append(" по предмету ");
            sb.append(student.subject);
            sb.append("\n");

        }
        return sb.toString();
    }

    private static class Student {
        @SerializedName("фамилия")
        String surname;
        @SerializedName("оценка")
        String mark;
        @SerializedName("предмет")
        String subject;

        public Student(String surname, String mark, String subject) {
            this.surname = surname;
            this.mark = mark;
            this.subject = subject;

        }
    }
}
