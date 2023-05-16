import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double numbers[] = {1.5, -5.6, 7.8, 5.9, -10.1, 34.6, -23.5, -56.0,12.3,3.5,-2.4,5.6,3.8,9.3,-6.3};
        double sum = 0;
        int amount = 0;
        boolean isNegative = false;
        for (double num : numbers) {
            if (num < 0) {
                isNegative = true;
            } else if (num > 0 && isNegative) {
                sum += num;
                amount++;
                System.out.println(num);
            }
        }
        System.out.println("среднее арифметическое" + sum / amount);

        sortArray(numbers);
    }

    public static void sortArray(double[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
             if (array[j] < array[minIndex]){
                 minIndex = j;
             }
            }
            if (minIndex != i){
                double temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
            System.out.println("Итерация "+(i+1)+": "+ Arrays.toString(array));
        }
        System.out.println("Отсортированный массив: "+ Arrays.toString(array));
    }
}


