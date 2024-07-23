import Model.Calculadora;
import View.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        Menu.mainMenu();
//        int escolha;
//
//        do {
//            System.out.println("Menu:");
//            System.out.println("1. Soma");
//            System.out.println("2. Subtração");
//            System.out.println("3. Multiplicação");
//            System.out.println("4. Divisão");
//            System.out.println("5. Porcentagem");
//            System.out.println("6. Média");
//            System.out.println("7. Mediana");
//            System.out.println("8. Moda");
//            System.out.println("9. Potência");
//            System.out.println("10. Converter Unidade");
//            System.out.println("11. Converter Volume");
//            System.out.println("12. Mostrar Histórico");
//            System.out.println("0. Sair");
//            System.out.print("Escolha uma opção: ");
//
//            escolha = scanner.nextInt();
//
//            switch (escolha) {
//                case 1:
//                    System.out.print("Digite o primeiro número: ");
//                    double a1 = scanner.nextDouble();
//                    System.out.print("Digite o segundo número: ");
//                    double b1 = scanner.nextDouble();
//                    System.out.println("Resultado: " + calculadora.soma(a1, b1));
//                    break;
//
//                case 2:
//                    System.out.print("Digite o primeiro número: ");
//                    double a2 = scanner.nextDouble();
//                    System.out.print("Digite o segundo número: ");
//                    double b2 = scanner.nextDouble();
//                    System.out.println("Resultado: " + calculadora.subtracao(a2, b2));
//                    break;
//
//                case 3:
//                    System.out.print("Digite o primeiro número: ");
//                    double a3 = scanner.nextDouble();
//                    System.out.print("Digite o segundo número: ");
//                    double b3 = scanner.nextDouble();
//                    System.out.println("Resultado: " + calculadora.multiplicacao(a3, b3));
//                    break;
//
//                case 4:
//                    System.out.print("Digite o dividendo: ");
//                    double a4 = scanner.nextDouble();
//                    System.out.print("Digite o divisor: ");
//                    double b4 = scanner.nextDouble();
//                    if (b4 == 0) {
//                        System.out.println("Erro: Divisão por zero não é permitida.");
//                    } else {
//                        System.out.println("Resultado: " + calculadora.divisao(a4, b4));
//                    }
//                    break;
//
//                case 5:
//                    System.out.print("Digite o total: ");
//                    double total = scanner.nextDouble();
//                    System.out.print("Digite a porcentagem: ");
//                    double porcentagem = scanner.nextDouble();
//                    System.out.println("Resultado: " + calculadora.porcentagem(total, porcentagem));
//                    break;
//
//                case 6:
//                    System.out.print("Digite o número de elementos: ");
//                    int n6 = scanner.nextInt();
//                    double[] numeros6 = new double[n6];
//                    for (int i = 0; i < n6; i++) {
//                        System.out.print("Digite o número " + (i + 1) + ": ");
//                        numeros6[i] = scanner.nextDouble();
//                    }
//                    System.out.println("Resultado: " + calculadora.media(numeros6));
//                    break;
//
//                case 7:
//                    System.out.print("Digite o número de elementos: ");
//                    int n7 = scanner.nextInt();
//                    double[] numeros7 = new double[n7];
//                    for (int i = 0; i < n7; i++) {
//                        System.out.print("Digite o número " + (i + 1) + ": ");
//                        numeros7[i] = scanner.nextDouble();
//                    }
//                    System.out.println("Resultado: " + calculadora.mediana(numeros7));
//                    break;
//
//                case 8:
//                    System.out.print("Digite o número de elementos: ");
//                    int n8 = scanner.nextInt();
//                    double[] numeros8 = new double[n8];
//                    for (int i = 0; i < n8; i++) {
//                        System.out.print("Digite o número " + (i + 1) + ": ");
//                        numeros8[i] = scanner.nextDouble();
//                    }
//                    System.out.println("Resultado: " + calculadora.moda(numeros8));
//                    break;
//
//                case 9:
//                    System.out.print("Digite o número: ");
//                    double numero9 = scanner.nextDouble();
//                    System.out.println("Resultado: " + calculadora.potencia(numero9));
//                    break;
//
//                case 10:
//                    System.out.print("Digite o número: ");
//                    double numero10 = scanner.nextDouble();
//                    System.out.print("Digite a unidade de origem (M/K/C): ");
//                    String unidadeOrigem = scanner.next();
//                    System.out.print("Digite a unidade de destino (M/K/C): ");
//                    String unidadeDestino = scanner.next();
//                    System.out.println("Resultado: " + calculadora.converterUnidade(numero10, unidadeOrigem, unidadeDestino));
//                    break;
//
//                case 11:
//                    System.out.print("Digite o número: ");
//                    double numero11 = scanner.nextDouble();
//                    System.out.print("Digite a unidade de origem (L/M): ");
//                    String unidadeOrigemVolume = scanner.next();
//                    System.out.print("Digite a unidade de destino (L/M): ");
//                    String unidadeDestinoVolume = scanner.next();
//                    System.out.println("Resultado: " + calculadora.converterVolume(numero11, unidadeOrigemVolume, unidadeDestinoVolume));
//                    break;
//
//                case 12:
//                    System.out.println("Histórico:");
//                    for (String item : calculadora.getHistorico()) {
//                        System.out.println(item);
//                    }
//                    break;
//
//                case 0:
//                    System.out.println("Saindo...");
//                    break;
//
//                default:
//                    System.out.println("Opção inválida, tente novamente.");
//                    break;
//            }
//
//            if (escolha != 0) {
//                System.out.println("Pressione Enter para voltar ao menu...");
//                scanner.nextLine();
//                scanner.nextLine();
//            }
//
//        } while (escolha != 0);
//
//        scanner.close();
    }
}
