package tasks.ArrayPractice;

public class ArrayPractice {

    public static int sumArray(int[] array){
        int sum = 0;
        for(int i=0;i< array.length;i++){
            sum = sum +array[i];

        }
        return sum;
    }
}
