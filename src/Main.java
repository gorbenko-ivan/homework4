public class Main {
    public static void main(String[] args) {

        byte age = 76;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }


        short temperatara = 5;
        if (temperatara < 5) {
            System.out.println("На улице " + temperatara + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatara + " градусов можно идти без шапки");
        }


        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }


        byte age1 = 2;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад ");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу ");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет ");
        }
        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу ");
        }

        byte childsAge = 1;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + " то ему нельзя кататься на аттракционе");
        }
        if (childsAge >= 5 && childsAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childsAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childsAge > 14) {
            System.out.println("Если возраст ребенка равен " + childsAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int travelsOnTheTrainCarriage = 60;
        byte trainCarriageCapacity = 102;
        byte seatPlace = 60;
        if (travelsOnTheTrainCarriage >= 0 && travelsOnTheTrainCarriage < 60) {
            System.out.println("в вагоне есть сидящие место");
        } else {
            if (travelsOnTheTrainCarriage >= 60 && travelsOnTheTrainCarriage < 102) {
                System.out.println("в вагоне есть стоячие место");
            } else {
                System.out.println("вагон уже полностью забит.");
            }
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > one && two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }


    }
}






