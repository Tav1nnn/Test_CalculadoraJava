package View;

import Controller.BasicOperationController;
import Model.BasicOperation;

import java.util.Scanner;

public class BasicOperationView {
    public static void basicOperationMenu() {
        System.out.println("=====Operações Basicas=====");
        System.out.println("Tecle 1 para sair");
        String input;

        Scanner scanner = new Scanner(System.in);

        input = scanner.next();

        if(input.equals("1")){
            Menu.mainMenu();
        }else {
            String result = new BasicOperationController().calculateBasicOperation(input);
            System.out.println(result);
        }

    }
}
