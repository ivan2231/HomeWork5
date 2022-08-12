public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 0;
        while ( i < 10) {
            i++;
            System.out.print ( i + " ");
        }
        System.out.println();
        for(; i >= 1; i--) {
            System.out.print ( i + " ");
        }
        System.out.println();

        //Задание2
        int firstFridayOfMonth =5;
        for (int friday = firstFridayOfMonth; friday <=31; friday+=7){
            System.out.printf("Сегодня пятница,%d-e число.Необходимо подготовить отчет.%n",friday);


        }

        //Задание3
        int period = 79;
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int startYear=0;
        for(int year=startYear;year<=end; year+=period) {
            if(year >= start){
                System.out.println(year);
            }
        }


        }
    }

