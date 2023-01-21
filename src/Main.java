public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        //task8();
        //task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 24;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать!");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний!");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку!");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки!");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age = 50;
        boolean kindergarten = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean university = age >= 18 && age <= 24;
        boolean work = age > 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (school) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (university) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (work) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte age = 50;
        boolean canNotRide = age <= 5;
        boolean rideAccompaniedByClimbers = age > 5 && age <= 14;
        boolean rideUnaccompaniedByAnAdult = age > 14;
        if (canNotRide) {
            System.out.println("Если возраст возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (rideAccompaniedByClimbers) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении.");
        } else if (rideUnaccompaniedByAnAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte carriage = 102;
        byte seats = 60;
        byte passengers = 95;
        boolean freeSittingPlaces = passengers <= seats;
        boolean freeStandingPlaces = passengers > seats && passengers < carriage;
        boolean noPlaces = passengers > carriage;
        if (freeSittingPlaces) {
            System.out.println("В вагоне есть сидячие и стоячие места!");
        } else if (freeStandingPlaces) {
            System.out.println("В вагоне толко стоячие места!");
        } else if (noPlaces) {
            System.out.println("В вагоне нет мест!");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean bigOne = one > two && one > three;
        boolean bigTwo = two > one && two > three;
        if (bigOne) {
            System.out.println("Число One самое большое!");
        } else if (bigTwo) {
            System.out.println("Число Two самое большое!");
        } else {
            System.out.println("Число Three самое большое!");
        }
    }
}