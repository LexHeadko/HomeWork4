public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
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
        byte age = 5;
        boolean kindergarten = age >= 2 && age <= 6;
        boolean school = age >= 7 && age <= 18;
        boolean university = age >= 18 && age <= 24;
        boolean work = age > 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (university) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (work) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }
}