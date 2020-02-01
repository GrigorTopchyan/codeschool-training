package homework2;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
        //Սխալ ես գրել
        //Պիտի ստւգես թէ մուտք արած թիվը արայի մեջ պարունակումա թէ չէ
        //եթե պարունակումա ապա որ ինդեքսի տակա
        //Ողղի
        if (n < array.length){
            System.out.println(array [n]);
        }else{
            System.out.println("The array does not contain the value");
        }
    }
}
