package edu.training.codeschool.homework_for_12_02_2020.homework_4;

public class AppTest {
    public static void main(String[] args) {
        Company company = new Company();
        company.hireEmployee(new Tester("George", 1200, 21));
        company.hireEmployee(new Designer("Xacho", 1200, 21));
        company.hireEmployee(new Programmer("Suro", 1200, 21));


    }
}
