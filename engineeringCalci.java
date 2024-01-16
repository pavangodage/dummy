public class engineeringCalci {
    // Following functon perform addition of two numbers . Let's suppose num1 = 10 ,
    // num2 = 20 then result will be 10 + 20 = 30.
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // Following function perform subtraction of two numbers . Let's suppose num1 =
    // 30 , num2 = 20 then result will be 30 - 20 = 10.
    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    // Following function perform multiplication of two numbers . Let's suppose num1
    // =
    // 10 , num2 = 20 then result will be 10 * 20 = 200.
    public int multiplication(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // Following function perform divison of two numbers . Let's suppose num1 =
    // 30 , num2 = 15 then result will be 30 / 15 = 2.
    public float divison(float num1, float num2)throws Exception {
        if(num2 == 0)
        {
            throw new Exception("Divide by zero Exception");
        }
        else
        {
            float result = num1 / num2;
            return result;

        }
    }

    // This function takes two integers as parameters num1 and num2 and returns the
    // modulus of the division using the % operator.
    // Let's suppose arguments 10 as the dividend(num1) and 3 as the divisor(num2)
    // then result will be 10 % 3 = 1.
    public int modula(int num1, int num2) {
        int result = num1 % num2;
        return result;
    }

    // Function to calculate power using a loop. Following function takes two
    // parameters double num & int key the num will be multiplies itself
    // key times means let's suppose num = 5 and key = 2 then the result will be 5*5
    // = 25.
    public double calculatePower(double num, int key) {
        double result = 1.0; // initializes the variable result with a value of 1.0.because, when calculating
                             // the power using a loop, you start with a base value that is typically 1.

        // Loop to multiply 'num' 'key' times
        for (int i = 0; i < key; i++) {
            result *= num;
        }

        return result;
    }

    // Following function caluculate the numtiplicative inverse of the number. It
    // take one parameter 'double number' for calculating inverse.
    public double Inverse(double number) {
        // Ensure that the number is not zero to avoid division by zero
        if (number == 0.0) {
            System.out.println("Cannot calculate the inverse of zero");
            return Double.POSITIVE_INFINITY; // Return positive infinity as a workaround .This approach avoids using
                                             // exception handling but provides a way to indicate that the inverse is
                                             // undefined for zero.
        }

        return 1.0 / number;
    }

    // Following function calculate factorial. It takes one integer parameter int number.
    // Let's suppose we have to calculate the factorial of number 5 then the result will be 5*4*3*2*1 = 120.
    public int fact(int number) {
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;  //The factorial of the number.
    }

    public static void main(String[] args) throws Exception {
        //engineeringCalci e1 = new engineeringCalci();

        // System.out.println(e1.add(10, 20));

        //System.out.println(e1.subtract(30, 0));

        // System.out.println(e1.multiplication(10,20));

        //System.out.println(e1.divison(30, 0));

        // System.out.println(e1.modula(10, 3));

        // System.out.println(e1.calculatePower(5, 2));

        // System.out.println(e1.Inverse(5));

        // System.out.println(e1.fact(5));
    }
}