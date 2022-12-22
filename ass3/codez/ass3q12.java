class ass3q12 extends Thread {
    public void start() {
        System.out.println("Hey Hey Hey What's up?!");
    }

    public static void main(String[] args) {
        ass3q12 myThread = new ass3q12();
        myThread.start();
    }
}

class sayHello extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello !");
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}