import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Gianni", 18));
        students.add(new Student("Maria", 18));
        students.add(new Student("Stefano", 16));
        students.add(new Student("Pina", 16));
        students.add(new Student("Sofia", 18));
        students.add(new Student("Marco", 18));
        students.add(new Student("Irene", 16));
        students.add(new Student("Miriam", 16));
        students.add(new Student("Francesco", 18));
        students.add(new Student("Mike", 18));
        students.add(new Student("Aurora", 16));
        students.add(new Student("Fabiana", 16));
        System.out.println(students);
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);
    }
}