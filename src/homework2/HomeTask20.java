package homework2;

public class HomeTask20 {
    public static void main(String[] args) {

        int num;
        int[] numbers = new int[] {1,2,3,4,5,7,8,9,10,11};
        //էս ինչ 11 ա որտեղից
        num = 11;
        //փոփոխականի աննուները java ում սենց ընդունված չի գծիկով դնել պիտի CamelCase լինի
        //սխալա աշխատում օրինակ {1,2,3,4,5,7,8,9,10,11} ի համար չի աշխատում
        int expected_num_sum = num * 5;
        int sum = 0;
        for (int i: numbers) {
              sum += i;

        }
       System.out.print( expected_num_sum - sum);

    }
}
