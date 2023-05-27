import java.util.*;

/* Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(). */

public class task001 {
    public static void main(String[] args) {

        double[] arr = array();
        System.out.println(arr);
        System.out.println(max(array()));
        System.out.println(min(array()));
        average(array());

    }

    static double[] array() {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumbers();
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }

    static double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static double min(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    static void average(double[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {

            avg += array[i] / array.length;
        }
        System.out.println(avg);
    }

    static int randomNumbers() {
        return (int) (Math.random() * 6) + 1;
    }

}
