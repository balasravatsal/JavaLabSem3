public class PassByReference
{
    String str="Hero";

 void display(PassByReference p)
{
    str="villain";
 }
 public static void main(String args[])
    {
        PassByReference p=new PassByReference();
        System.out.println("String before method calling: "+p.str);
        p.display(p);
        System.out.println("String after method calling: "+p.str);
    }
}