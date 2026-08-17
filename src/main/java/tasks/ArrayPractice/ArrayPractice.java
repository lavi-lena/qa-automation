package tasks.ArrayPractice;

public class ArrayPractice {

    public static int sumArray(int[] array){
        int sum = 0;
        for(int i=0;i< array.length;i++){
            sum = sum +array[i];

        }
        return sum;
    }
    public static boolean contains(int[]array,int target){
        boolean isFound = false;
        for (int i = 0;i<array.length;i++){
            if (array[i] ==target){
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public static boolean contains2(int[]array,int target){

        for (int i = 0;i<array.length;i++){
            if (array[i] ==target){
               return true;
            }
        }
       return false;
    }

    public static int getEvenNumbersCount(int[]array){
       int evenNumbersCount =0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                evenNumbersCount= evenNumbersCount+1;

            }
        }
        return evenNumbersCount;

    }

    public static int getMinNumber(int[]array){
        int min = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }

        }
        return min;
    }

    public static double getAverage(double[]array){
        double sum = 0;
        for (int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        double average = sum/array.length;
        return average;
    }

}
