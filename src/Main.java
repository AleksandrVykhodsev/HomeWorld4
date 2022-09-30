public class Main {
    public static void main(String[] args) {
        //Задание 1/1
        System.out.println("Задание 1/1!!!");
        int age = 16;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!!!");
        }
        if (age < 18){
            System.out.println("Вы еще не совершеннолетний, нужно немного подождать.");
        }
        //Задание 1/2
        System.out.println("Задание 1/2!!!");
        int age1 = 26;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Вы можете учиться в университете.");
        }
        if (age1 >= 24) {
            System.out.println("Можете искать первую работу.");
        }
        //Задание 1/3
        System.out.println("Задание 1/3!!!");
        int general = 102;
        int sedentary = 60;
        int people = 19;
        if (people < sedentary) {
            System.out.println("В вагоне есть сидячие и стоячие места.");
        }
        if (people >=60 && people < general) {
            System.out.println("В вагоне есть стоячие места.");
        }
        if (people >= general) {
            System.out.println("В вагоне нет мест.");
        }
        //Задание 2/1
        System.out.println("Задание 2/1!!!");
        int age2 = 24;
        if (age2 >= 18){
            System.out.println("Поздравляем с совершеннолетием.");
        }else{
            System.out.println("Вы еще не совершеннолетний.");
        }
        //Задание 2/2
        System.out.println("Задание 2/2!!!");
        int age3 = 27;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (age3 >= 18 && age3 < 24) {
            System.out.println("Вы можете учиться в университете.");
        }else  {
            System.out.println("Пора искать первую работу.");
        }
        //Задание 2/3
        System.out.println("Задание 2/3!!!");
        int general1 = 102;
        int sedentary1 = 60;
        int people1 = 124;
        if (people1 < sedentary1) {
            System.out.println("В вагоне есть сидячие и стоячие места.");
        }
        else if (people1 >=60 && people1 < general1) {
            System.out.println("В вагоне есть стоячие места.");
        }
        else {
            System.out.println("В вагоне нет мест.");
        }
        //Задание 3/1
        System.out.println("Задание 3/1!!!");
        int age4 = 25;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в детский сад.");
        } else if (age4 >= 7 && age4 < 18) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в школу.");
        } else if (age4 >= 18 && age4 < 24) {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age4 + " , то ему нужно ходить на работу.");
        }
        //Задание 3/2
        System.out.println("Задание 3/2!!!");
        int age5 = 16;
        if (age5 < 5) {
            System.out.println("Ребенок не может кататься на атракционе.");
        } else if (age5 >= 5 && age5 < 14) {
            System.out.println("Ребенок может кататься в сопровождении взрослого.");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }
        //Задание 3/3
        System.out.println("Задание 3/3!!!");
        int one = 5;
        int two = 7;
        int free = 9;
        if (one > two && one > free) {
            System.out.println("Число " + one + " большее.");
        } else if (two > one && two > free) {
            System.out.println("Число " + two + " большее.");
        } else {
            System.out.println("Число " + free + " большее.");
        }

        System.out.println("Спасибо за проверку!!!");


    }
}