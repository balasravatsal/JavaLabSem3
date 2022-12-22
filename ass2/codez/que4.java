public class que4 {
    public static void main(String[] args) {
        Student s1 = new Student("Vatsal",85);
        System.out.println("Printing Overloading Constructor");
        s1.display();
        Student s2 = new Student(s1);
        System.out.println("Printing Copy Constructor");
        s2.display();
    }
}

class Student{
    String name;
    int RollNo;

    public Student(String s){
        name = s;
    }
    public Student(String s,int Roll){
        name = s;
        RollNo = Roll;
    }
    public Student(Student s){
        name = s.name;
        RollNo = s.RollNo;
    }
    void display(){
        System.out.println("Name: "+name+" Roll Number: "+RollNo+ "\n");
    }
}