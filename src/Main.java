import com.sun.source.tree.IfTree;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека ,больше или равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека ,меньше " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задача 2
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + "градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //Задача 3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + "км/ч, придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }

        //Заача 4
        int ageReachesChild = 25;
        if (ageReachesChild >= 2 && ageReachesChild <= 6) {
            System.out.println("Если возраст человека равен " + ageReachesChild + " лет, то ему нужно ходить в детский сад.");
        } else if (ageReachesChild >= 7 && ageReachesChild <= 17) {
            System.out.println("Если возраст человека равен " + ageReachesChild + " лет, то ему нужно ходить в школу.");
        } else if (ageReachesChild >= 18 && ageReachesChild <= 24) {
            System.out.println("Если возраст человека равен " + ageReachesChild + " то его место в университете.");
        } else if (ageReachesChild > 24) {
            System.out.println("Если возраст человека равен " + ageReachesChild + "  то ему пора ходить на работу..");
        }

        //Задача 5
        int ageChild = 5;
        if (ageChild <= 5) {
            System.out.println(" Если возраст ребенка равен " + ageChild + " то он не может кататься на аттракционе.");
        }
        if (ageChild > 5 && ageChild < 14) {
            System.out.println(" Если возраст ребенка равен " + ageChild + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageChild > 14) {
            System.out.println(" Если возраст ребенка равен " + ageChild + " то он может кататься без сопровождения взрослого..");
        }
        //Задача 6
        int passengers = 50;
        if (passengers < 60) {
            System.out.println("Если количество пассажиров " + passengers + " человек. Свободные места есть и стоячие, и сидячие.");
        }
        if (passengers >= 60 && passengers < 102) {
            System.out.println("Если количество пассажиров " + passengers + " человек. Свободные места остались только стоячие, но еще есть.");
        } else if (passengers >= 102) {
            System.out.println("Если количество пассажиров " + passengers + " человек. Простите, свободных мест нет!.");
        }
        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two) {
            System.out.println("Один меньше двух");
        }
        if (two > one && two < three) {
            System.out.println("Один меньше двух . Два больше одного но меньше трех");
        }
        if (three > two) {
            System.out.println("Три больше двух");
        }
    }
}
