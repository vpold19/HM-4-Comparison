public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age=17;
        if (age>=18){
            System.out.println("он совершеннолетний");
        }
        if (age<18){
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp=10;
        if (temp>5){
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (temp<5){
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed=180;
        if (speed>60){
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }
        if (speed<60){
            System.out.println("Если скорость " + speed + " , то  можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
    }
    public static void task5() {
        System.out.println("Задача 5");
    }
    public static void task6() {
        System.out.println("Задача 6");
    }
    public static void task7() {
        System.out.println("Задача 7");
    }
}