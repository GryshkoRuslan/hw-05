import java.util.Scanner;

public class SecondClass {

    String month;
    public void whatIsASeason() {
        Scanner consoleInput = new Scanner(System.in);
            System.out.println("Привет давай сейчас узнаем какое время года, введи текущий месяц:");
            month = consoleInput.next().toLowerCase();
            consoleInput.close();
            switch (month) {
                case "декабрь" :
                case "январь" :
                case "февраль" : {
                    System.out.println("Сейчас зима");
                    break;
                }
                case "март" :
                case "апрель" :
                case "май" : {
                    System.out.println("Сейчас весна");
                    break;
                }
                case "июнь" :
                case "июль" :
                case "август" : {
                    System.out.println("Сейчас лето");
                    break;
                }
                case "сентябрь" :
                case "октябрь" :
                case "ноябрь" : {
                    System.out.println("Сейчас осень");
                    break;
                }
                default: {
                    System.out.println("Что то я такого месяца не знаю");
                    break;
                }
            }
        }

        public void SumOfNumbersWhichWereDevidedTo3 () {
            int sum = 0;
            for (int i = 20; i <= 100; i++) {
                if (i % 3 == 0) {
                    sum += i;
                }
            }
            System.out.println("Сумма чисел на отрезке от 20 до 100 которые кратны 3 равна: " + sum);
        }

    }

