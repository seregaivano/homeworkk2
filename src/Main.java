public class Main {
    public static void main(String[] args) {
    // задача 1
    int age = 18;
        if (age >= 18) {

                System.out.println("Если возраст человека равен " + age + " или больше,  он совершеннолетний");
                }
                int age1 = 17;
                if (age1 < 18) {
        System.out.println("Если возраст человека равен " + age1 +" он не достиг совершеннолетия, нужно немного подождать");
        }
        // задача 2
        int temperature = 3;
        if ( temperature <= 5){
        System.out.println("На улице ниже 5 градусов,нужно надеть шапку ");
        int temperature1 = 8;
        if ( temperature1 > 5){
        System.out.println("На улице больше 5 градусов,можно идти без шапки ");
        }
        //задача 3
        int speed = 58;
        if ( speed <= 59 ) {
        System.out.println("Если скорость 58, то можно ездить спокойно");
        int speed1 = 62;
        if (speed1 >= 61) {
        System.out.println("Если скорость 62, то придется заплатить штраф");
        }
        // задача 4
        int year = 24;
        if (year >= 2 && year <= 6) {
        System.out.println("Если человеку " + year + " лет, то ему нужно ходить в детский сад");
        } else if (year >= 7 && year <= 18) {
        System.out.println("Если человеку " + year + " лет, то ему нужно ходить в детский сад");
        } else if (year >= 18 && year <= 24) {
        System.out.println("Если человеку " + year + " лет, то его место в университете.");
        } else if (year > 24) {
        System.out.println("Если человеку " + year + " лет,  то ему пора ходить на работу.");
        }
        // задача 5
        int year1 = 7;
        if (year1 < 5) {
        System.out.println("Если ребенку меньше " + year1 + " лет, то он не может кататься на аттракционе");
        } else if (year1 > 5 && year1 < 14) {
        System.out.println("Если ребенку " + year1 + " лет, то он должен кататься на аттракционе в сопровождении взрослого");
        } else if (year1 > 14) {
        System.out.println("Если ребенок старше " + year1 + " лет, то он может кататься без сопровождения взрослого.");
        }
        // задача 6
        int numberTickets = 75;
        if (numberTickets < 60) {
        System.out.println("Если " + numberTickets + " меньше 60,  значит в вагоне есть сидячие места ");
        } else if (numberTickets > 60 && numberTickets < 102) {
        System.out.println("Если вагоне " + numberTickets + " человек, то значит в вагоне есть стоячие места");
        } else if (numberTickets > 102) {
        System.out.println("Если больше" + numberTickets + " значит вагон уже полностью забит");
        }
        // задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (three > two && two > one) {
        System.out.println("Три больше двух и одного");
        } else if (two > one && two > three) {
        System.out.println("два больше одного и трёх");
        } else if (one > two && one > three) {
        System.out.println("Один больше двух и трёх");


        }
        }
        }
        }
        }

