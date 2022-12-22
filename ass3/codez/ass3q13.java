public class ass3q13 {
    public static void main(String[] args) {
        ABC o1 = new ABC("Satellite lauching in...");
        Thread t = new Thread(o1, "Satellite lauching in...");
        t.start();
    }
}

class ABC implements Runnable {
    public String name;

    public ABC(String s) {
        name = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
