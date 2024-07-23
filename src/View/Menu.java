package View;

import Model.BasicOperation;

import java.util.Scanner;

public class Menu {

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        int direction = 0;

        do {
            System.out.println("======MENU======");
            System.out.println("1. Operações básicas [Soma (+), Subtração(-), Divisão(/), Multiplicação(*)]");
            System.out.println("2. Calcúlos de média [Média, Mediana, Moda]");
            System.out.println("3. Potência/Raiz");
            System.out.println("4. Conversor de unidades [Comprimento e Volume]");
            System.out.println("5. Histórico");
            System.out.println("6. Sair");

            System.out.println("=>");
            direction = scanner.nextInt();
        }while (direction <= 0 || direction > 6);

        switch (direction) {
            case 1:
                BasicOperationView.basicOperationMenu();

            case 6:
                return;
        }

        scanner.close();
    }
}
