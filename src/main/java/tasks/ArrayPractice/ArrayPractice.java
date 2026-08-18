package tasks.ArrayPractice;

public class ArrayPractice {

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        return sum;
    }

    public static boolean contains(int[] array, int target) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }

    public static boolean contains2(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int getEvenNumbersCount(int[] array) {
        int evenNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbersCount = evenNumbersCount + 1;

            }
        }
        return evenNumbersCount;

    }

    public static int getMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public static double getAverage(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static int[] replaceNegativesWithZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }


        return array;
    }

    public static int findElementIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int getNumCount(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count = count + 1;
            }
        }
        return count;
    }

    public static boolean isIncreasing(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;


            }
        }
        return true;
    }

    public static int findMaxAtEvenIndices(int[] array) {
        int max = array[0];
        for (int i = 2; i < array.length; i = i + 2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static String joinStrings(String[] words) {
        String result = words[0];
        for (int i = 1; i < words.length; i++) {
            result = result + " " + words[i];
        }
        return result;
    }

    public static int getDiffMaxMin(int[] array) {
        int min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int result = max - min;
        return result;

    }

    public static int isGreaterThanLeftNeighbor(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                count = count + 1;
            }
        }
        return count;
    }

    public static int[] linearScale(int[] array, int multiplier) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * multiplier;
        }
        return array;
    }

    public static boolean isMirrored(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] toReversed(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
        return array;
    }
    public static int findSecondMax(int[] array){
        int max = array[0];
        for(int i=1;i<array.length;i++){
          if(array[i]>max){
              max=array[i];
          }
        }

        int secondMax = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if(array[i]<max && array[i]>secondMax){
                secondMax=array[i];
            }
        }
        return secondMax;
    }
}

