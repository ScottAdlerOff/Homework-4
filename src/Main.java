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

    public static void task1(){
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }


    }
    public static void task2(){
        System.out.println("Задача 2");
        int temperature = -8;
        if (temperature < -5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

    }
    public static void task3(){
        System.out.println("Задача 3");
        int speed = 65;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " ,то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " ,то можно ездить спокойно.");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int age = 12;
        if (age >= 2 && age < 6){
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        } else {
            if (age >= 7 && age < 18){
                System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
            } else {
                if (age >= 18 && age < 24){
                    System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");
                } else {
                    System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу");
                }
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 11;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " ,то ему нельзя кататься на аттракционе");
        } else {
            if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                if (age >= 14) {
                    System.out.println("Если возраст ребенка равен " + age + " ,то ему можно кататься на аттракционе без сопровождения взрослого");
                }
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
    int capacityСarriage = 102;
    int peopleInCarriage = 58;
    if (peopleInCarriage < 60){
        System.out.println("В вагоне людей " + peopleInCarriage + " человек, значит еще остались сидячие места");
    } else {
        if (peopleInCarriage >= 60 && peopleInCarriage < capacityСarriage){
            System.out.println("В вагоне людей " + peopleInCarriage + " человек, значит еще остались стоячие места в вагоне");
        }else {
            System.out.println("В вагоне людей " + peopleInCarriage + " человек, значит мест в вагоне не осталось");
        }
    }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 17;
        int two = 4;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше всех остальных");
        } else {
            if (one > two && one < three) {
                System.out.println("Число " + three + " больше всех остальных");
            } else {
                System.out.println("Число " + two + " больше всех остальных");
            }
        }
    }
}
