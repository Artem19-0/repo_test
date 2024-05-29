package model;

import foodProject.F;
import foodProject.G;

import java.util.Arrays;

public class Person {

    public static int age;

    public static void main(String[] args) {
//        Person.age=1;
//        Person.age++;
//        System.out.println(Person.age);

        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,8,13,19},19));
       bubbleSort(new int[]{2,4,1,5,8,3,0});

       Cat cat = new Cat("barsik");
        System.out.println(cat.name);
        String name = cat.name = "murzik";
        System.out.println(name);
    }



    //*
    //
    //**1. Алгоритм поиска двоичным поиском**
    //
    //Этот алгоритм используется для поиска элемента в отсортированном массиве.
    // Он разделит массив пополам и сравнит целевое значение со средней точкой.
    // В зависимости от результата поиска алгоритм будет повторять процесс рекурсивно до тех пор,
    // пока не будет найден элемент или массив не будет пуст.
    // *//
    public static int binarySearch(int arr[] , int target ){
        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Целевое значение не найдено
    }

    //*
    // **2. Алгоритм сортировки пузырьком**
    //Этот алгоритм сортирует массив, сравнивая соседние элементы и обменивая их местами,
    // если они находятся не в порядке. Он будет проходить по массиву несколько раз до тех пор,
    // пока все элементы не будут отсортированы.
    // *//

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }




}
abstract class Artem implements F, G {
    abstract void move();


}

class A extends Artem{

    @Override
    public void print() {

    }

    @Override
    public String say() {
        return null;
    }

    @Override
    void move() {

    }
}