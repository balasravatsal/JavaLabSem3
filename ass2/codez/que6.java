public class que6 {
    static void numOfString(String...str){
        System.out.println("Number of String :"+str.length);
        for(String s:str)
            System.out.println(s);
    }
    public static void main(String[] args) {
        numOfString("I" , "am" , "Vatsal");
        numOfString("Vatsal","Balasra");
        numOfString("Vatsal");
    }
}