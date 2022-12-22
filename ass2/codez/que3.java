public class que3{

    public static void main(String[] args) {

        System.out.println("Default constructor called:");
        emp e1 = new emp();
        e1.display();

        System.out.println("Paremeterized constructor called:");
        emp e2 = new emp("Vatsal","085","CSE");

        System.out.println("Name of : "+e2.Name+"\nRoll No : "+e2.RollNo+"\nBranch : "+e2.Branch);
    }
}

class Student {

    protected String Name;
    protected String RollNo;

    public Student(){
        RollNo = "Not set";
        Name = "Not set";
    }

    public Student(String a , String b){
        RollNo = a;
        Name = b;
    }
}

class emp extends Student{

    String Branch;
    public emp(){
        Branch = "Not Set";
    }

    public emp(String a, String b, String c){
        super(a,b);
        Branch = c;
    }

    public void display(){

        System.out.println(Name+"\n"+RollNo+"\n"+Branch);
    }
}