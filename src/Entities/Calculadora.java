package Entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Calculadora {
    private List<String> historico = new ArrayList<>();

    public double soma(double a, double b) {
        double resultado = a + b;
        historico.add("Soma: " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    public double subtracao(double a, double b) {
        double resultado = a - b;
        historico.add("Subtracao: " + a + " - " + b + " = " + resultado);
        return resultado;
    }

    public double multiplicacao(double a, double b) {
        double resultado = a * b;
        historico.add("Multiplicacao: " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    public double divisao(double a, double b) {
        double resultado = a / b;
        historico.add("Divisao: " + a + " / " + b + " = " + resultado);
        return resultado;
    }

    public double porcentagem(double total, double porcentagem) {
        double resultado = (total * porcentagem) / 100;
        historico.add("Porcentagem: " + total + " % " + porcentagem + "% = " + resultado);
        return resultado;
    }

    public double media(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }

    public double mediana(double[] numeros) {
        Arrays.sort(numeros);
        double resultado;
        if (numeros.length % 2 == 0) {
            resultado = (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) / 2.0;
        } else {
            resultado = numeros[numeros.length / 2];
        }
        historico.add("Mediana: " + Arrays.toString(numeros) + " = " + resultado);
        return resultado;
    }

    public double moda(double[] numeros) {
        HashMap<Double, Integer> frequencia = new HashMap<>();
        for (double numero : numeros) {
            frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
        }
        double moda = numeros[0];
        int contaMaxima = 0;
        for (double numero : frequencia.keySet()) {
            int conta = frequencia.get(numero);
            if (conta > contaMaxima) {
                moda = numero;
                contaMaxima = conta;
            }
        }
        historico.add("Moda: " + Arrays.toString(numeros) + " = " + moda);
        return moda;
    }

    public double aoQuadrado(double numero) {
        double resultado = Math.pow(numero, 2);
        historico.add("Ao Quadrado: " + numero + " = " + resultado);
        return resultado;
    }

    public double potencia(double numero) {
        double resultado = Math.pow(numero, 2);
        historico.add("Potencia: " + numero + " ^ 2 = " + resultado);
        return resultado;
    }

    public double converterUnidade(double numero, String unidadeOrigem, String unidadeDestino) {
        double resultado = numero;
        switch (unidadeOrigem) {
            case "M":
                if (unidadeDestino.equals("K")) {
                    resultado = numero / 1000;
                } else if (unidadeDestino.equals("C")) {
                    resultado = numero / 100;
                }
                break;
            case "K":
                if (unidadeDestino.equals("M")) {
                    resultado = numero * 1000;
                } else if (unidadeDestino.equals("C")) {
                    resultado = numero * 100000;
                }
                break;
            case "C":
                if (unidadeDestino.equals("M")) {
                    resultado = numero * 100;
                } else if (unidadeDestino.equals("K")) {
                    resultado = numero / 100000;
                }
                break;
        }
        historico.add("Unidade convertida: " + numero + " " + unidadeOrigem + " para " + unidadeDestino + " = " + resultado);
        return resultado;
    }

    public double converterVolume(double numero, String unidadeOrigem, String unidadeDestino) {
        double resultado = numero;
        switch (unidadeOrigem) {
            case "L":
                if (unidadeDestino.equals("M")) {
                    resultado = numero * 1000;
                }
                break;
            case "M":
                if (unidadeDestino.equals("L")) {
                    resultado = numero / 1000;
                }
                break;
        }
        historico.add("Volume convertido: " + numero + " " + unidadeOrigem + " para " + unidadeDestino + " = " + resultado);
        return resultado;
    }

    public List<String> getHistorico() {
        return historico;
    }
}
