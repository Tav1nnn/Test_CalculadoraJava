
# Documentação de código - Calculadora
---

### `soma(double a, double b)`

```java
public double soma(double a, double b) {
    double resultado = a + b;
    historico.add("Soma: " + a + " + " + b + " = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método realiza a operação de soma entre dois números e registra a operação no histórico.

**Explicação Matemática:**
A soma de dois números \( a \) e \( b \) é dada por:
######  Resultado = a + b 

**Explicação do Código:**
1. **Cálculo da Soma:** O método calcula a soma dos dois números `a` e `b` e armazena o resultado na variável `resultado`.
   ```java
   double resultado = a + b;
   ```
2. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`. Isso permite rastrear todas as operações realizadas.
   ```java
   historico.add("Soma: " + a + " + " + b + " = " + resultado);
   ```
3. **Retorno:** O resultado da soma é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.soma(5, 3);  // Resultado: 8.0
```

---

### `subtracao(double a, double b)`

```java
public double subtracao(double a, double b) {
    double resultado = a - b;
    historico.add("Subtracao: " + a + " - " + b + " = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método realiza a operação de subtração entre dois números e registra a operação no histórico.

**Explicação Matemática:**
A subtração de dois números \( a \) e \( b \) é dada por:
######  Resultado} = a - b 

**Explicação do Código:**
1. **Cálculo da Subtração:** O método calcula a subtração do número `b` do número `a` e armazena o resultado na variável `resultado`.
   ```java
   double resultado = a - b;
   ```
2. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Subtracao: " + a + " - " + b + " = " + resultado);
   ```
3. **Retorno:** O resultado da subtração é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.subtracao(5, 3);  // Resultado: 2.0
```

---

### `multiplicacao(double a, double b)`

```java
public double multiplicacao(double a, double b) {
    double resultado = a * b;
    historico.add("Multiplicacao: " + a + " * " + b + " = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método realiza a operação de multiplicação entre dois números e registra a operação no histórico.

**Explicação Matemática:**
A multiplicação de dois números \( a \) e \( b \) é dada por:
######  Resultado = a * b 

**Explicação do Código:**
1. **Cálculo da Multiplicação:** O método calcula a multiplicação dos dois números `a` e `b` e armazena o resultado na variável `resultado`.
   ```java
   double resultado = a * b;
   ```
2. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Multiplicacao: " + a + " * " + b + " = " + resultado);
   ```
3. **Retorno:** O resultado da multiplicação é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.multiplicacao(5, 3);  // Resultado: 15.0
```

---

### `divisao(double a, double b)`

```java
public double divisao(double a, double b) {
    double resultado = a / b;
    historico.add("Divisao: " + a + " / " + b + " = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método realiza a operação de divisão entre dois números e registra a operação no histórico.

**Explicação Matemática:**
A divisão de dois números \( a \) e \( b \) é dada por:
######  Resultado = a / b

**Explicação do Código:**
1. **Cálculo da Divisão:** O método calcula a divisão do número `a` pelo número `b` e armazena o resultado na variável `resultado`.
   ```java
   double resultado = a / b;
   ```
2. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Divisao: " + a + " / " + b + " = " + resultado);
   ```
3. **Retorno:** O resultado da divisão é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.divisao(6, 3);  // Resultado: 2.0
```

---

### `porcentagem(double total, double porcentagem)`

```java
public double porcentagem(double total, double porcentagem) {
    double resultado = (total * porcentagem) / 100;
    historico.add("Porcentagem: " + total + " % " + porcentagem + "% = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método calcula a porcentagem de um número e registra a operação no histórico.

**Explicação Matemática:**
A porcentagem de um valor \( \text{total} \) dada uma taxa \( \text{porcentagem} \) é calculada por:
Entendi! Aqui está o texto em formato Markdown, sem a expressão matemática:


###### Resultado = (total × porcentagem) / 100


**Explicação do Código:**
1. **Cálculo da Porcentagem:** O método calcula o valor correspondente à porcentagem de `total` usando a fórmula descrita e armazena o resultado na variável `resultado`.
   ```java
   double resultado = (total * porcentagem) / 100;
   ```
2. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Porcentagem: " + total + " % " + porcentagem + "% = " + resultado);
   ```
3. **Retorno:** O resultado da porcentagem é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.porcentagem(200, 15);  // Resultado: 30.0
```

---

### `media(double[] numeros)`

```java
public double media(double[] numeros) {
    double soma = 0;
    for (double numero : numeros) {
        soma += numero;
    }
    return soma / numeros.length;
}
```

**Descrição:**
Este método calcula a média aritmética de um array de números.

**Explicação Matemática:**
A média aritmética é a soma de todos os valores dividida pelo número de valores:
######  Média = (Soma dos valores) / (Número de valores)
**Explicação do Código:**
1. **Inicialização da Soma:** A variável `soma` é inicializada com o valor 0.
   ```java
   double soma = 0;
   ```
2. **Loop para Soma:** Um loop `for` percorre cada valor no array `numeros`, adicionando cada valor à variável `soma`.
   ```java
   for (double numero : numeros) {
       soma += numero;
   }
   ```
   - **`for (double numero : numeros)`**: Itera sobre cada elemento do array `numeros`.
   - **`soma += numero`**: Adiciona o valor atual `numero` à `soma`.

3. **Cálculo da Média:** O método divide a soma total pelo número de valores no array `numeros` para obter a média.
   ```java
   return soma / numeros.length;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.media(new double[]{1, 2, 3, 4, 5});  // Resultado: 3.0
```

---

### `mediana(double[] numeros)`

```java
public double mediana(double[] numeros) {
    Arrays.sort(n

umeros);
    double resultado;
    if (numeros.length % 2 == 0) {
        resultado = (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) / 2.0;
    } else {
        resultado = numeros[numeros.length / 2];
    }
    historico.add("Mediana: " + Arrays.toString(numeros) + " = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método calcula a mediana de um array de números.

**Explicação Matemática:**
A mediana é o valor que separa a metade superior da metade inferior de um conjunto de dados ordenados:
- Se o número de elementos é ímpar, a mediana é o elemento do meio.
- Se o número de elementos é par, a mediana é a média dos dois elementos centrais.

**Explicação do Código:**
1. **Ordenação:** O array `numeros` é ordenado em ordem crescente usando o método `Arrays.sort`.
   ```java
   Arrays.sort(numeros);
   ```
2. **Verificação de Paridade:** Um `if` verifica se o número de elementos no array é par ou ímpar.
   ```java
   if (numeros.length % 2 == 0) {
   ```
   - **`numeros.length % 2 == 0`**: Verifica se o número de elementos é par (se o resto da divisão por 2 é 0).

3. **Cálculo da Mediana:** Dependendo da paridade, o método calcula a mediana:
   - **Para números pares:** A mediana é a média dos dois elementos centrais.
     ```java
     resultado = (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) / 2.0;
     ```
   - **Para números ímpares:** A mediana é o elemento central.
     ```java
     resultado = numeros[numeros.length / 2];
     ```
4. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Mediana: " + Arrays.toString(numeros) + " = " + resultado);
   ```
5. **Retorno:** O resultado da mediana é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.mediana(new double[]{1, 3, 3, 6, 7, 8, 9});  // Resultado: 6.0
```

---

### `moda(double[] numeros)`

```java
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
```

**Descrição:**
Este método calcula a moda de um array de números, ou seja, o valor que ocorre com mais frequência.

**Explicação Matemática:**
A moda é o valor que aparece com maior frequência em um conjunto de dados. Se dois ou mais valores ocorrem com a mesma frequência máxima, todos são considerados moda.

**Explicação do Código:**
1. **Contagem de Frequências:** Um `HashMap` é usado para contar a frequência de cada número no array.
   ```java
   HashMap<Double, Integer> frequencia = new HashMap<>();
   ```
   - **`frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);`**: Atualiza a frequência do número atual. O método `getOrDefault` retorna o valor associado à chave `numero`, ou 0 se a chave não existir. Em seguida, 1 é adicionado à frequência atual.

2. **Determinação da Moda:** Um loop percorre as chaves do `HashMap` para encontrar o número com a maior frequência.
   ```java
   double moda = numeros[0];
   int contaMaxima = 0;
   for (double numero : frequencia.keySet()) {
       int conta = frequencia.get(numero);
       if (conta > contaMaxima) {
           moda = numero;
           contaMaxima = conta;
       }
   }
   ```
   - **`for (double numero : frequencia.keySet())`**: Itera sobre cada chave do `HashMap`.
   - **`if (conta > contaMaxima)`**: Verifica se a frequência atual é maior do que a frequência máxima registrada. Se for, atualiza a moda e a frequência máxima.

3. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Moda: " + Arrays.toString(numeros) + " = " + moda);
   ```
4. **Retorno:** O resultado da moda é retornado.
   ```java
   return moda;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.moda(new double[]{1, 2, 2, 3, 4});  // Resultado: 2.0
```

---

### `aoQuadrado(double numero)`

```java
public double aoQuadrado(double numero) {
    double resultado = Math.pow(numero, 2);
    historico.add("Ao Quadrado: " + numero + " = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método calcula o quadrado de um número e registra a operação no histórico.

**Explicação Matemática:**
O quadrado de um número \( x \) é dado por:
###### Resultado = x²

**Explicação do Código:**
1. **Cálculo do Quadrado:** O método usa a função `Math.pow` para elevar `numero` ao quadrado e armazena o resultado na variável `resultado`.
   ```java
   double resultado = Math.pow(numero, 2);
   ```
2. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Ao Quadrado: " + numero + " = " + resultado);
   ```
3. **Retorno:** O resultado do quadrado é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.aoQuadrado(4);  // Resultado: 16.0
```

---

### `potencia(double numero)`

```java
public double potencia(double numero) {
    double resultado = Math.pow(numero, 2);
    historico.add("Potencia: " + numero + " ^ 2 = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método calcula a potência de um número elevado ao quadrado e registra a operação no histórico.

**Explicação Matemática:**
A potência de um número \( x \) ao quadrado é calculada da mesma forma que o quadrado:
###### Resultado = x^2

**Explicação do Código:**
1. **Cálculo da Potência:** O método usa a função `Math.pow` para elevar `numero` ao quadrado e armazena o resultado na variável `resultado`.
   ```java
   double resultado = Math.pow(numero, 2);
   ```
2. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Potencia: " + numero + " ^ 2 = " + resultado);
   ```
3. **Retorno:** O resultado da potência é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.potencia(5);  // Resultado: 25.0
```

---

### `converterUnidade(double numero, String unidadeOrigem, String unidadeDestino)`

```java
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
    historico.add

("Unidade convertida: " + numero + " " + unidadeOrigem + " para " + unidadeDestino + " = " + resultado);
    return resultado;
}
```

**Descrição:**
Este método converte um valor de uma unidade para outra e registra a operação no histórico.

**Explicação Matemática:**
A conversão entre unidades pode ser realizada usando fatores de conversão específicos. As conversões suportadas são:
- De metros (M) para quilômetros (K) e centímetros (C).
- De quilômetros (K) para metros (M) e centímetros (C).
- De centímetros (C) para metros (M) e quilômetros (K).

**Explicação do Código:**
1. **Inicialização do Resultado:** O valor inicial é atribuído à variável `resultado`.
   ```java
   double resultado = numero;
   ```
2. **Conversão de Unidades:** Um `switch` é usado para determinar a unidade de origem e converter o valor para a unidade de destino.
   ```java
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
   ```
   - **`case "M":`**: Trata as conversões de metros.
     - **Para quilômetros:** Divide o número por 1000.
     - **Para centímetros:** Divide o número por 100.
   - **`case "K":`**: Trata as conversões de quilômetros.
     - **Para metros:** Multiplica o número por 1000.
     - **Para centímetros:** Multiplica o número por 100000.
   - **`case "C":`**: Trata as conversões de centímetros.
     - **Para metros:** Multiplica o número por 100.
     - **Para quilômetros:** Divide o número por 100000.

3. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Unidade convertida: " + numero + " " + unidadeOrigem + " para " + unidadeDestino + " = " + resultado);
   ```
4. **Retorno:** O resultado da conversão é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.converterUnidade(5000, "M", "K");  // Resultado: 5.0
```

---

### `converterVolume(double numero, String unidadeOrigem, String unidadeDestino)`

```java
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
```

**Descrição:**
Este método converte um valor de uma unidade de volume para outra e registra a operação no histórico.

**Explicação Matemática:**
A conversão entre unidades de volume pode ser realizada usando fatores de conversão específicos:
- De litros (L) para mililitros (M).
- De mililitros (M) para litros (L).

**Explicação do Código:**
1. **Inicialização do Resultado:** O valor inicial é atribuído à variável `resultado`.
   ```java
   double resultado = numero;
   ```
2. **Conversão de Volume:** Um `switch` é usado para determinar a unidade de origem e converter o valor para a unidade de destino.
   ```java
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
   ```
   - **`case "L":`**: Trata a conversão de litros para mililitros.
     - **Para mililitros:** Multiplica o número por 1000.
   - **`case "M":`**: Trata a conversão de mililitros para litros.
     - **Para litros:** Divide o número por 1000.

3. **Registro no Histórico:** O resultado da operação é formatado como uma string e adicionado à lista `historico`.
   ```java
   historico.add("Volume convertido: " + numero + " " + unidadeOrigem + " para " + unidadeDestino + " = " + resultado);
   ```
4. **Retorno:** O resultado da conversão é retornado.
   ```java
   return resultado;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
double resultado = calc.converterVolume(2, "L", "M");  // Resultado: 2000.0
```

---

### `getHistorico()`

```java
public List<String> getHistorico() {
    return historico;
}
```

**Descrição:**
Este método retorna o histórico de operações realizadas pela calculadora.

**Explicação do Código:**
1. **Retorno do Histórico:** O método retorna a lista `historico`, que contém registros de todas as operações realizadas.
   ```java
   return historico;
   ```

**Método de Uso:**
```java
Calculadora calc = new Calculadora();
calc.soma(5, 3);
List<String> historico = calc.getHistorico();
// Histórico contém: ["Soma: 5.0 + 3.0 = 8.0"]
```

---



