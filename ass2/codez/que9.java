public class que9 {
    void print(){
        System.out.println("Inside Ninth Class");
                System.out.println("End of method of Ninth Class");
    }
    public static void main(String[] args) {
        que9 obj1 = new que9();
        obj1.print();
        A obj2 = new A();
        obj2.print(obj1);
        B obj3= new B();
        obj3.print(obj1,obj2);
        D obj4 = new D();
        obj4.print(obj1);
    }
}
class A extends que9{
    void print(que9 obj2){
        System.out.println("Inside A class");
        obj2.print();

        System.out.println("End of method od A class");
    }
}
class D extends que9{
    void print(que9 obj1){
        System.out.println("Inside D class");
        obj1.print();
        System.out.println("Exiting D class");
    }
}
class B extends A{
    void print (que9 obj1, A obj2){
        System.out.println("Inside B class");
        obj2.print(obj1);
        System.out.println("Ending the method inside B class");
    }
}