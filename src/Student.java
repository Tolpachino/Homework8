public class Student {
    int studentID;
    String name;
    String surname;
    int studYear;
    double midMathGrade;
    double midEconomicGrade;
    double midLanguageGrade;

    Student(int id1, String name1, String surname1, int studYear1, double midMathGrade1, double midEconomicGrade1, double midLanguageGrade1) {
        studentID = id1;
        name = name1;
        surname = surname1;
        studYear = studYear1;
        midMathGrade = midMathGrade1;
        midEconomicGrade = midEconomicGrade1;
        midLanguageGrade = midLanguageGrade1;
    }

    Student(int id2, String name2, String surname2, int studYear2) {
        this(id2, name2, surname2, studYear2, 0.0, 0.0, 0.0);
    }

    Student() {
    }

    public void midGrade() {
        System.out.println((midEconomicGrade + midMathGrade + midLanguageGrade) / 3);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student studentFirst = new Student();
        studentFirst.studentID = 1;
        studentFirst.name = "Stepan";
        studentFirst.surname = "Ivanov";
        studentFirst.studYear = 2022;
        studentFirst.midMathGrade = 3.8;
        studentFirst.midEconomicGrade = 4.6;
        studentFirst.midLanguageGrade = 5.0;


        Student studentSecond = new Student(2, "Ivan", "Vagner", 2019, 4.5, 2.7, 3.4);

        Student studentThird = new Student(3, "Aleksey", "Suvorov", 2020);

        studentFirst.midGrade();
        studentSecond.midGrade();
        studentThird.midGrade();

    }
}
