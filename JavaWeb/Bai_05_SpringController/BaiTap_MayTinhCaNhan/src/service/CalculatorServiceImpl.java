package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double add(double number1, double number2) {
        return number1+number2;
    }

    @Override
    public double sub(double number1, double number2) {
        return number1-number2;
    }

    @Override
    public double mul(double number1, double number2) {
        return number1*number2;
    }

    @Override
    public double div(double number1, double number2) {
        return number1/number2;
    }
    @Override
    public String cal(double number1,double number2,String operand){
       switch (operand){
           case "Addition(+)":
                return String.valueOf(add(number1,number2));

           case "Subtraction(-)":
              return String.valueOf(sub(number1,number2));

           case "Multiplication(*)":
              return String.valueOf(mul(number1,number2));

           case "Division(/)":
//               try {
//                   if (number2!=0){
//                       return String.valueOf(div(number1,number2));
//                   }
//               }catch (Exception e){
//                   e.getMessage();
//               }
               if (number2!=0){
                return String.valueOf(div(number1,number2));
               }else {
                   return "khong the chia cho 0";
               }
           default:
               return "-1";
       }

    }
}
