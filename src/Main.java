public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 24;
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать!");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний!");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = 5;
        if (temperature <= 5){
            System.out.println("На улице " + temperature +" градусов, нужно надеть шапку!");
        }
        else {
            System.out.println("На улице " + temperature +" градусов, можно идти без шапки!");
        }
    }
}