package edu.codeschool.training.homework3;

import com.javalesson.controlstatement.Array;

import java.util.Arrays;
import java.util.Scanner;

//անունները դզի
public class HomeTask2 {
    public static void main(String[] args) {
        int n;
        int t;
        Scanner sc = new Scanner(System.in);
        n  = sc.nextInt();
        int[] arr = arrayFromNumber(n);
        System.out.println(Arrays.toString(arr));


    }
    public static int [] arrayFromNumber(int number){
        int t;
        int [] arr = new int[Integer.toString(number).length()];
        while (number != 0) {
            t = number % 10;
            //սենց մի արա մի հատ counter պահի հերթով գումարի
            //օրինակ arr[counter++] = t;
            arr[Integer.toString(number).length() - 1] = t;
            number = (number - t)/10;
        }
        return arr;
    }

}
