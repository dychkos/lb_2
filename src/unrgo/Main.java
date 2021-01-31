package unrgo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ініціалізуємо обьекти класу Students
        Students st1 = new Students("Steave Jobs",22,401);
        Students st2 = new Students("Alex Mersrer",18,202);
        Students st3 = new Students("Sergey Dychko",18,201);
        Students st4 = new Students("Yung Blud",22,302);

        //ініалцзуємо массив обьектів Students
        Students [] sts = {st1,st2,st3,st4};

        System.out.println("Before sort");
        for(Students s : sts){
            System.out.println(s);
        }
        //сортування за допогою методу классу Array
        //Для зміни поля сортування потрібно замінити другий параметр Arrays.sort
        //Сортування за полем group - без другого аргументу
        //Сортування за полем age - new StudentsAgeComparator()
        //Сортування за полем age - new StudentsNameComparator()
        Arrays.sort(sts,new StudentsNameComparator());
        System.out.println("After sort");
        for(Students s : sts){
            System.out.println(s);
        }

        /*
        * Створіть просту ієрархію спадкування, яка відповідає сутностям Рослина (властивості:
        *  назва, ареал розповсюдження, вік) та Дерева і Квіти. Продемонструйте перевантаження
        *  конструкторів та методів, * перевизначення методів, особливості роботи
        *  конструкторів при спадкуванні.*/

        //ініціалізуємо обьекти класу Tree
        Tree dub = new Tree("Dub","Europe",12);
        Flower romashka = new Flower("Romashka","Europe",1);
        System.out.println(dub);
        System.out.println(romashka);


        //ArrayIndexOutOfBoundsException
        int i;
        int n = 5;
        int a[] = new int[n];
        n=12;
        try{
            for (i = 0; i < n; i++)
                a[i] = (int) (Math.random() * 11);
            System.out.println("Filled ");
        }
        catch (ArrayIndexOutOfBoundsException arrEX){
            System.out.println("Упс, мы вишли з масиву!");
        }
        finally {
            System.out.println("Це фінал");
        }

        //ArithmeticException
        try {

            int d = 0;

            int c = 42 / d;

        }

        catch (ArithmeticException e) {

            System.out.println("division by zero");

        }


        //NullPointerException and Exeption
        try {

            Students stNull = null;
            stNull.getAge();


        }

        catch (NullPointerException e) {

            System.out.println("stNull дорівнює нуллю");

        }
        catch (Exception ex){
            System.out.println("Глобальний exeption");
        }


       //IndexOutOfBoundsException
        try{
            int []arrErr = {12,4,6,12,3,4,5};
            System.out.println(arrErr[112]);
        }
        catch (IndexOutOfBoundsException indexEx){
            System.out.println("Такого елемента массива не существует");
        }


    }
}
