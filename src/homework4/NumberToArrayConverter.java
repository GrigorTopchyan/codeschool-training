package homework4;

public class NumberToArrayConverter {
    public int[] convert(int number) {

int count=0;
int temp = number;
while (temp>0){
    temp/=10;
    count++;
}



        int[] arr = new int[count];
        int i = 0;

        while (number > 0) {
            arr[i++] = number % 10;
            number /= 10;
        }
        return arr;
    }
}
