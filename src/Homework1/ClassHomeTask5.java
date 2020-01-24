package Homework1;

public class ClassHomeTask5 {
    public static void main(String[] args) {

        int i = 0;
        int i1 = 4;

        while (i < i1) {
            String s = "";
            String s1 = "";
            for (int j = 0; j < i1 - i; j++) s += " ";
            for (int j = 0; j < 2 * i + 1; j++) s1 += "*";
            System.out.println(s + s1);
            i++;
        }
    }
}