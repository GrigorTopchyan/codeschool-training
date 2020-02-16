package HomeWork7.HomeTask1;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] array = {1,2,4,5,6,8,45,345,54,655,45};
        int [] array1 = {3,4,54,21,43,53,67,88,33,23};
        int element = 4;
        int element1 = 888;
        ArraysUtil.concatenateTwoArrays(array,array1);
        ArraysUtil.findIndex(array,element);
        ArraysUtil.reverseArr(array);
        ArraysUtil.reverseArrNegative(array);
        ArraysUtil.sort(array1);
        ArraysUtil.findSecond(array1);
        ArraysUtil.doubleArray(array1);
        ArraysUtil.contains(array1,4);
    }
}
