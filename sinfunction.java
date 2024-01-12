 class sinfunction 
{
    public static double sin(double number)
    {
        return Math.sin(Math.toRadians(number));
    }
    public static void main(String[] args) 
    {
        double number=12.94;
        double result=sin(number);
        System.out.println("sin of" + number +"degree is " + result);
    }
}