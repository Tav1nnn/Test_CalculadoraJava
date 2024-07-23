package Controller;

public class BasicOperationController {
    public String calculateBasicOperation(String input) {

        if(input.contains("+")){
            String strNumber1 = "";
            String srtNumber2 = "";
            for(int i = 0; i<input.indexOf("+"); i++){
                strNumber1 += input.charAt(i);

            }

            for(int i = input.indexOf("+") + 1; i<input.length(); i++){
                srtNumber2 += input.charAt(i);
            }


            Double number1 = Double.parseDouble(strNumber1);
            Double number2 = Double.parseDouble(srtNumber2);

            Double result = number1 + number2;

            return input + " = " + result;
        }

        return null;
    }
}
