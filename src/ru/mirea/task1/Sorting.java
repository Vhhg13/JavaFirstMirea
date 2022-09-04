package ru.mirea.task1;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args){
        int[] array=new int[10];

        System.out.println("Массив, заполненный с помощью Math.random():");
        for(int i=0;i<10;++i)
            array[i]=(int)(Math.random()*100);
        for(int i : array)
            System.out.print(i+" ");

        System.out.println("\nПосле сортировки:");
        Arrays.sort(array);
        for(int i : array)
            System.out.print(i+" ");
        ///////////////////////////////////////////////////////////////////
        System.out.println("\n\nМассив, заполненный с помощью Random:");
        Random rnd = new Random();
        for(int i=0;i<10;++i)
            array[i]=rnd.nextInt(100);
        for(int i : array)
            System.out.print(i+" ");

        System.out.println("\nПосле сортировки:");
        Arrays.sort(array);
        for(int i : array)
            System.out.print(i+" ");
    }
}
