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
        int age = 14;
        System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить");
        if (age > 2 && age <6){
            System.out.println("в детский сад");
        } else if ( age> 7 && age<18){
            System.out.println("в школу");
        } else if( age> 18 && age<24 ){
            System.out.println("в университете");
        } else if( age> 24){
            System.out.println("на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age=18;
        System.out.println("Если возраст ребенка равен " + age + ", то ему ");
        if(age<5){
            System.out.println("нельзя кататься на аттракционе");
        } else if(age>5 && age<=14){
            System.out.println("можно кататься на аттракционе в сопровождении");
        } else if(age>14){
            System.out.println("можно кататься без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
       int totalSeats=102;
       int seats=60;
       int standSeats=totalSeats-seats; // стоячия места
        int seatsUsed=30;
        int standSeatsUsed=25;
        if( seatsUsed<seats){
            System.out.println( (seats - seatsUsed) +  " сидячих мест осталось");
        } else {
        } System.out.println("Сидячих мест нет");
        if (standSeatsUsed<standSeats) {
        System.out.println( (standSeats - standSeatsUsed) +  " стоячих мест осталось");
        } else {
        } System.out.println("Стоячих мест нет");
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one=45;
        int two=30;
        int three=15;
        if(one>two){
if(one>=three){
    System.out.println("Максимальное число " + one);
} else{
    System.out.println("Максимальное число " + three);
}
    }else if(two>one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        }else{
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else if(three>one) {
                System.out.println("Максимальное число " + three);
            } else{
                System.out.println("Все три числа равны");

            }
            }
        }
}