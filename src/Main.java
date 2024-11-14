public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2");
        float temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        short speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int age2 = 13;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
        }
        System.out.println("Задача 5");
        int age3 = 16;
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе");
        }
        if (age3 >= 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int passengers = 55;
        if (passengers < 60) {
            System.out.println("Если количество пассажиров " + passengers + ", то сидячие места еще есть");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("Если количество пассажиров " + passengers + ", то остались только стоячие места");
        } else {
            System.out.println("Если количество пассажиров " + passengers + ", то вагон уже полностью забит");
        }
        System.out.println("Задача 7");
        int one = 20;
        int two = 23;
        int three = 27;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        } else {
            System.out.println("Число " + three + " больше остальных");
        }
    }
}