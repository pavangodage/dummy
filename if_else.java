import java.util.Scanner;

public class if_else 
{
    public static void main(String[] args) 
    {
        
        System.out.println("Enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

    if (age>=18)
    {
        System.out.println("you can vote");       
    }
    else
    {
        System.out.println("you cannot vote");
    }
        
    }
    
}