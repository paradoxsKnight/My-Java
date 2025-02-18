// Exception hendaling
import java.util.Scanner;
class Exception_H
{
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int n = sc.nextInt();
    try
    {
       if(n>100)
       {
        throw new MyException("This is my error");
       }
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}

class MyException extends Exception
{
  public MyException(String message)
  {
    super(message);
  }
}