/*Задание
Дан массив [3, 22, 1, 13, 4, 6, 16, 5], состоящий из целых чисел.

1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.

2.Напишите программу, которая выводит все двузначные числа массива.

3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.

4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.

5.***Напишите программу, которая переворачивает массив в обратном порядке.
*/
public class Main {
    public static void main(String[] args) {
        //объявляем массив
        int [] array = {3, 22, 1, 13, 4, 6, 16, 5};

        System.out.println("Program #1");
        //программа 1
        for(int number : array){
            if(number%2 == 0) System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Program #2");
        //программа 2
        for(int number : array){
            if((number >-100 && number <-9) || (number>9 && number <100)) System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Program #3");
        //программа 3
        //System.out.print(Arrays.stream(array).max().getAsInt()); - вроде, так тоже можно, но пока не проходили)
        if (array.length !=0) {
            int maxValue = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > maxValue) maxValue = array[i];
            }
            System.out.println(maxValue);
        }
        System.out.println("Program #4");
        //программа 4
        int sum=0;
        for (int number:array) {
            sum+=number;
        }

        System.out.println(sum);
        System.out.println("Program #5");
        //программа 5
        int[]invertedArray = new int[array.length];
        for(int i= 0; i<array.length; i++){
            invertedArray[i] = array[array.length-i-1];
            System.out.print(invertedArray[i] + " ");
        }
    }
}