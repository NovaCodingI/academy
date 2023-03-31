package returnEx;

import java.util.Scanner;

public class Calculator1 {
    private double number1;
    private double number2;
    private String operator;

    public Calculator1(double number1, double number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public double calculate() {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            default:
                return 0;
        }
    }
    		
    		public static void main(String[] args) {
    			
    					
    					Scanner scanner = new Scanner(System.in);
    					
    					System.out.print("첫 번째 숫자를 입력하세요: ");
    					double number1 = scanner.nextDouble();
    					
    					System.out.print("두 번째 숫자를 입력하세요: ");
    					double number2 = scanner.nextDouble();
    					
    					System.out.print("연산자를 입력하세요: ");
    					String operator = scanner.next();
    					
    					Calculator1 calculator = new Calculator1(number1, number2, operator);
    					double result = calculator.calculate();
    					
    					System.out.println("계산 결과는 " + result + "입니다.");
    					
    			
    			}
    		}
    		

