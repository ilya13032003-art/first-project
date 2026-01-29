//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true) {
            printMenu();

            int i = scanner.nextInt();

            if (i == 1) {
                stepTracker.addNewNumbersStepPerDay();
            } else if (i == 2) {
                stepTracker.changeStepGoal();
            } else if (i == 3) {
                stepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("Выход");
                scanner.close();
                return;
            } else {
                System.out.println("Выбранной вами команды не существует, попробуйте еще раз");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберите число, соответствующее тому, что бы вы хотели сделать: 1 - ввести количество шагов за определённый день; 2- изменить цель по количеству шагов в день; 3- напечатать статистику за определённый месяц; 4- выход из приложения");
    }
}


