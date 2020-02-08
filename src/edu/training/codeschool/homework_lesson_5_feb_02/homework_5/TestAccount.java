package edu.training.codeschool.homework_lesson_5_feb_02.homework_5;

public class TestAccount {
    public static void main(String[] args) {
        Accaount accaount1 = new Accaount("1", "John", 1500.0);
        Accaount accaount2 = new Accaount("2", "Tyrion");
        accaount1.credit(100);
        accaount1.debit(300);
        accaount1.transferTo(accaount2, 300);
        System.out.println(accaount1);
        System.out.println(accaount2);

    }
}
