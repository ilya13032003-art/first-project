import java.util.Scanner;


class StepTracker {
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Scanner scanner;
    Converter converter = new Converter();

    StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumbersStepPerDay() {  //этот метод предлагали сделать без бесконечного цикла, но как по мне тыкать дибилов в их ошибки и возвращать обратно приятнее
        int i;
        int j;
        int k;
        while (true) {
            System.out.println("Введите номер месяца");
            i = scanner.nextInt();
            if (i < 1 || i > 12) {
                System.out.println("Такого месяца не существует");
            } else {
                i = i - 1;
                break;
            }
        }
        while (true) {
            System.out.println("Введите день от 1 до 30");
            j = scanner.nextInt();
            if (j < 1 || j > 30) {
                System.out.println("Выбрано некорректное число");
            } else {
                j = j - 1;
                break;
            }
        }
        while (true) {
            System.out.println("Введите количество шагов");
            k = scanner.nextInt();
            if (k < 0) {
                System.out.println("Вы ввели отрицательное число");
            } else {
                break;
            }
        }
        MonthData monthData = monthToData[i];
        monthData.days[j] = k;
    }


    void changeStepGoal() {
        while (true) {
            System.out.println("Введите новую цель на месяц");
            goalByStepsPerDay = scanner.nextInt();
            if (goalByStepsPerDay <= 0) {
                System.out.println("Вы ввели неверное значение");
            } else {
                System.out.println("Новое значение сохранено");
                break;
            }
        }
    }

    void printStatistic() {
        while (true) {
            System.out.println("Укажите номер месяца, за который вы бы хотели узнать статистику");
            int i = scanner.nextInt();
            if (i < 1 || i > 12) {
                System.out.println("Такого месяца не существует");
            } else {
                System.out.println("Количество пройденных шагов по дням:");
                monthToData[i - 1].printDaysAndStepsFromMonth();
                System.out.println("Вы прошли за месяц " + monthToData[i - 1].sumStepsFromMonth() + " шагов");
                System.out.println("Максимальное количество шагов за день " + monthToData[i - 1].maxSteps() + " шагов");
                System.out.println("Среднее количество шагов в день: " + (monthToData[i - 1].sumStepsFromMonth() / 30) + " шагов");
                System.out.println("Пройденная дистанция: " + converter.converterToKm(monthToData[i - 1].sumStepsFromMonth()) + " километров"); //    todo измени!!!
                System.out.println("Количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(monthToData[i - 1].sumStepsFromMonth())); // todo
                System.out.println("Ваша лучшая серия была: " + monthToData[i - 1].bestSeries(goalByStepsPerDay)
                        + " дней");
                break;
            }

        }
    }
}