package edu.codeschool.training.classes_objects.homework7.wrappers.classes;

import java.util.Objects;

public class Test1 {

    public static void main(String[] args) {

        Company company1 = new Company("Ucom");
        Company company2 = new Company("Viva");


        System.out.println(company1.equals(company2));

    }
}




class Company {
    String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Company otherCompany = (Company)obj;
        return this.name.equals(otherCompany.name);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}






