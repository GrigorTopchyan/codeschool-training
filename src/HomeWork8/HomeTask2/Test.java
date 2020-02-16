package HomeWork8.HomeTask2;

public class Test {
    public static void main(String[] args) {
        Company company1 = new Company("Arman", new Address("USA", "Las Vegas", "Sherlock", 999999999),
                new Department[12],
                new Contact("armangmail.com", "1234234", "099999999"));
        Company company2 = new Company("Arman", new Address("USA", "Las Vegas", "Sherlock", 999999999),
                new Department[12],
                new Contact("armangmail.com", "1234234", "099999999"));
        Company company3 = new Company("Arman", new Address("USA", "Las Vegas", "Sherlock", 999999999),
                new Department[12],
                new Contact("armangmail.com", "1234234", "07777777"));

        System.out.println(company1.equals(company2));
        System.out.println(company1.equals(company3));
    }
}
