public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не совершенно летний, нужно немного подождать");
        }

        System.out.println("Задача 2");

        int temp = 11;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, шапку нужно надеть");
        }
        int temp2 = 3;
        if (temp2 < 5) {
            System.out.println("На улице " + temp2 + " градуса, шапку можно не надевать");
        }

        System.out.println("Задача 3");

        int speed = 120;
        if (speed > 60) {
            System.out.println("Скорость превышена, нужно заплатить штраф");
        } else {
            System.out.println("Можно ездить спокойно");
        }


        System.out.println("Задача 4");

        int age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в садик");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить на работу");
        }

        System.out.println("Задача 5");

        int childage = 13;
        if (childage < 5) {
            System.out.println("Если возраст ребенка равен " + childage + " то ему нельзя кататься на аттракционе");
        } else if (childage > 5 && childage < 14) {
            System.out.println("Если возраст ребенка равен " + childage + " то можно кататься в сопровождении взрослого");
        } else if (childage > 14) {
            System.out.println("Если возраст ребенка равен " + childage + " то может кататься без сопровождения взрослого");
        }

        System.out.println("Задача 6");
        int capacityVan = 102;
        int seating = 60;
        if (seating < 60 && capacityVan < 102) {
            System.out.println("Есть сидячие места в вагоне");
        } else if (seating == 60 && capacityVan < 102) {
            System.out.println("Есть в вагоне стоячие места");
        } else if (seating == 60 && capacityVan >= 102) ;
        {
            System.out.println("Вагон полностью забит");
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число one");
        }
        else if (two > three) {
            System.out.println("Наибольшее число two");
        } else
            System.out.println("Наибольшее число three");




    }}









