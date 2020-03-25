package edu.training.codeschool.exceptions.homework_2;

public class UserTest {
    public static void main(String[] args){

        try {
            User user = new User("Bxdo", "bxdo@gmail.com", "12345678");
//            User user1 = new User("Bxdo", "bxdogmail.com", "12345678");
//            User user2 = new User("Bxdo", "bxdo@gmail.com", "1234567");
//            User user23= new User("Bxdo", "bxdogmail.com", "1234567");

        }catch (IllegalEmailException | IllegalPasswordException e){
            System.out.println(e);
        }finally {
            System.out.println("finally");
        }


    }
}
