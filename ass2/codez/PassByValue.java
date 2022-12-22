public class PassByValue
{
  String str="Hero";

 void display(String str)
 {
    str="villain";
}
  public static void main(String args[])
  {
    PassByValue p = new PassByValue();
    System.out.println("String before method calling: "+p.str);
    p.display("sidekick");
    System.out.println("String after method calling: "+p.str);
  }
}