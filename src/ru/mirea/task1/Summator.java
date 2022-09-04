package ru.mirea.task1;

public class Summator {
    public static void main(String[] args){

        int[] numArray=new int[10];
        int i;
        for(i=0;i<10;++i)
            numArray[i]=(int)(Math.random()*100)%100;
        System.out.print("Рабочий массив:");
        for(i=0;i<10;++i)
            System.out.print(" "+numArray[i]);




        int sum=0;
        System.out.print("\nПодсчёт суммы с помощью цикла for дал результат ");
        for(int iter : numArray)
            sum+=iter;
        System.out.println(sum);

        sum=0;
        System.out.print("Подсчёт суммы с помощью цикла while дал результат ");
        i=0;
        while(i<10)
            sum+=numArray[i++];
        System.out.println(sum);

        sum=0;
        i=0;
        System.out.print("Подсчёт суммы с помощью цикла do while дал результат ");
        do{
            sum+=numArray[i++];
        }while(i<10);
        System.out.println(sum);
    }
}