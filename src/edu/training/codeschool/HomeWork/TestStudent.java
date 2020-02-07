package edu.training.codeschool.HomeWork;


public class TestStudent {
    public static void main(String[] args) {


        Student student = new Student("Hayk", 25, 1994);
        Student student2 = new Student("Hayk", 26, 1993);
        Student student3 = new Student("Hayk", 28, 1992);

        System.out.println(Student.getCount());
    }
}
