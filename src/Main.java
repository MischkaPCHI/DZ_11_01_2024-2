import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> student = new ArrayList<>();
        student.add(new Student("Jack",4,false));
        student.add(new Student("Nikolay",7,true));
        student.add(new Student("Ann",1,false));
        student.add(new Student("Nicole",19,false));
        student.add(new Student("Maria",11,true));
        student.add(new Student("Raf",14,true));

        PrintSelection.print();

        int yourChoice = scanner.nextInt();

        if (yourChoice==2){
            Collections.sort(student,new SortMissedLessons());
        }
        if (yourChoice==3){
            Collections.sort(student, new SortOfNumbersInTheName());
        }
        if (yourChoice==4){
            Collections.sort(student, new SortOfFinancedJobcenter());
        }
        System.out.println(student);
    }
}