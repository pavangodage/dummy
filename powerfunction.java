class powerfunction
{
    public static double power(double base1 ,double base2)
    {
        return Math.pow(base1, base2);
    }
    public static void main(String[] args) 
    {
        double base1=4.04;
        double base2=3.12;
        double result =power(base1, base2);
        System.out.println("the base is " + base1 + " ^ " + base2 + "is"+result);
    } 
}