import java.util.Scanner;

class AgeIsNegativeException extends Exception
{
    String errorMessage;
    public AgeIsNegativeException(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }
    public String toString()
    {
        return errorMessage;
    }
}

public class ass3q9 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter Your Age:");
        age = sc.nextInt();
        sc.close();
        try
        {
            if(age < 0)
            {
                throw new AgeIsNegativeException("Age can not be Negative!");
            }
        }
        catch(AgeIsNegativeException e)
        {
            System.out.println(e);
        }
    }
}