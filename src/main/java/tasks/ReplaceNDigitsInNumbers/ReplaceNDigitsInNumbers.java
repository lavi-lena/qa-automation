package tasks.ReplaceNDigitsInNumbers;

import java.util.Scanner;

public  class ReplaceNDigitsInNumbers {

    public static void solve() {
       Scanner scanner = new Scanner(System.in);
       int numCount = scanner.nextInt();
       long changeLimit = scanner.nextLong();
       long[] numbers = new long[numCount];
       long sumBefore = 0;
       for (int i = 0; i < numCount; i++) {
           numbers[i] = scanner.nextLong();
           sumBefore = sumBefore + numbers[i];
       }
       for (int p = 1; p <= changeLimit; p++) {
           int indexNumChange = 0;
           long biggestChangeProfit = 0;
           for (int i = 0; i < numCount; i++) {
               long unchangedNumber = numbers[i];
               long changedNumber = replaceFirstDigitToNine(unchangedNumber);
               long profit = changedNumber - unchangedNumber;
               if (profit > biggestChangeProfit) {
                   biggestChangeProfit = profit;
                   indexNumChange = i;
               }
           }

           numbers[indexNumChange] = replaceFirstDigitToNine(numbers[indexNumChange]);

       }

       long sumAfter = 0;
       for (int i= 0;i<numbers.length;i++){
           sumAfter= sumAfter + numbers[i];
       }
       long result = sumAfter-sumBefore;
       System.out.println(result);

   }

    public static long replaceFirstDigitToNine(long number) {
        String stringNumber = String.valueOf(number);
        String newStringNumber = '9' + stringNumber.substring(1);

        return Long.parseLong(newStringNumber);
    }
}
