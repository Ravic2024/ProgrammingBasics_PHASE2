package Collections;

import java.util.ArrayList;
import java.util.List;

public class SN11_ListinsideList {

    static void main() {

        List<Integer> student1Marks = new ArrayList<>();
        student1Marks.add(80);
        student1Marks.add(85);
        student1Marks.add(90);

        List<Integer> student2Marks = new ArrayList<>();
        student2Marks.add(70);
        student2Marks.add(75);
        student2Marks.add(80);

        List<List<Integer>> allStudentMarks = new ArrayList<>();

        allStudentMarks.add(student1Marks);
        allStudentMarks.add(student2Marks);

        for(List<Integer> marks: allStudentMarks) {
            System.out.println(marks);
        }

    }

}
