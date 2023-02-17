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
       int ticket=10;
       System.out.println("Мой номер билета " + ticket);
       if(ticket>0 && ticket<=60){
           System.out.println("достанется сидячее место");
       } else if(ticket>60 && ticket<=102){
           System.out.println("достанется сидячее место");
       } else if(ticket>102){
           System.out.println("место не достанется");
       }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one=1;
        int two=2;
        int three=3;
        boolean whichNumberIsSmaller=one<two && two<three;
        if(whichNumberIsSmaller){
            System.out.println(one + " самое маленькаое число из всех");
        }
        boolean whichNumberIsAverage=two>one && two<three;
        if(whichNumberIsAverage){
            System.out.println(two + " среднее число из всех ");
        }
        boolean whichNumberIsBigger= three>one && three>two;
        if(whichNumberIsBigger){
            System.out.println(three + " самое большое число из всех");
        }
    }
}