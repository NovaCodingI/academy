package returnEx;

public class Calculator {
	
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
    	
    	Calculator calculator = new Calculator();
    	int sum = calculator.add(2, 3); // sum 변수에 5가 저장됩니다.
    	int diff = calculator.subtract(5, 3); // diff 변수에 2가 저장됩니다.
    	int product = calculator.multiply(2, 3); // product 변수에 6이 저장됩니다.
    	int quotient = calculator.divide(10, 2); // quotient 변수에 5가 저장됩니다.
    	
    	System.out.println(sum);
    	System.out.println(diff);
    	System.out.println(product);
    	System.out.println(quotient);
    	
    }
}

