package GeekBrains;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        // 2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью
        // цикла(-ов) заполнить его диагональные элементы единицами;

        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        // 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
        // вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.

        // 7. **** Написать метод, которому на вход подается одномерный массив и число n
        // (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива
        // на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        // При каком n в какую сторону сдвиг можете выбирать сами.

        //Задание 1:
        System.out.println("Задание 1:");
        int[] array1 =  {1,1,0,0,1,0};
        changeNum(array1);
        System.out.println();
        System.out.println();

        //Задание 2:
        System.out.println("Задание 2:");
        int[] array2 = new int[8];
        fillArray(array2);
        System.out.println();
        System.out.println();

        //Задание 3:
        System.out.println("Задание 3:");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(array3);
        System.out.println();

        //Задание 4:
        System.out.println("Задание 4:");
        int[][] array4 = new int[5][5];
        fillDiagArr(array4);
        System.out.println();


        //Задание 5:
        System.out.println("Задание 5:");
        int[] array5 = {4, 8, 1 , 56 ,78 ,3 ,9};
        findMaxMin(array5);
        System.out.println();

        //Задание 6:
        System.out.println("Задание 6:");
        int[] array6 = {2,7,3,1,5};
        //findEqual(array6);
        System.out.println(findEqual(array6));



        }
        // Метод меняющий в массиве 1 на 0 и наоборот. Результат выводится в консоль
        public static void changeNum (int[] array) {
            System.out.println("Первоначальный массив: ");
            System.out.println(Arrays.toString(array));
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                }
                else {
                    array[i] = 1;
                }
            }
            System.out.println("Новый массив:");
            System.out.println(Arrays.toString(array));
        }
        // Метод заполняет массив элементами
        public static void fillArray (int[] array) {
            for (int i=0; i< array.length; i++) {
                array[i] = i * 3;
                System.out.print(array[i] + " ");
            }
        }
        // Метод умножает элемент массива на 2 если элемент меньше 6. Результат выводится в консоль
        public static void changeArray (int[] array){
            System.out.println("Первоначальный массив:");
            System.out.println(Arrays.toString(array));
        for (int i = 0; i< array.length; i++){
            if (array[i]<6) {
                array[i] = array[i]*2;
            }
        }
            System.out.println("Новый массив:");
            System.out.println(Arrays.toString(array));
        }
        // Метод заполняет диагональ массива единицами
        public static void fillDiagArr (int[][] array){
            for (int i =0; i< array.length; i++){
                for (int j = 0; j<array[i].length; j++) {
                    if (i == j) {
                        array[i][j] = 1;
                    }
                    if (j == ((array.length-1) - i)) {
                        array[i][j] = 1;
                    }
                }
                    System.out.println(Arrays.toString(array[i]));

            }
        }
        // Метод ищет максимальный и минимальный элемент массива и выводит их в консоль
        public static void findMaxMin (int[] array){
        int max = -2147483647, min = 2147483647;
        for (int i = 0; i<array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
            System.out.println(Arrays.toString(array));
            System.out.println("Максимальное число в массиве: "+max);
            System.out.println("Минимальное число в массиве: " +min);
        }

        //
        public static boolean findEqual (int[] array) {
            float sum = 0, half;
            boolean x=false;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            half = sum / 2;
            sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                if (sum == half) {
                    x = true;
                }
            }
               return x;
            }



}
