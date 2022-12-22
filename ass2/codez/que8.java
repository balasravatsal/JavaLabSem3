public class que8 {
    public static void main(String[] args) {
        CallConstructor obj = new CallConstructor();
    }
}
class CallConstructor  {
    public CallConstructor () {
        System.out.println("Inside the default constructor");
        this.CallConstructor ();
    }
    static void CallConstructor (){
        System.out.println("Inside the constructor called by default constructor");
    }
}
