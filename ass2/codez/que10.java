
public class que10 {
    public static void main(String args[]) {
        HDFC s = new HDFC();
        ICICI i = new ICICI();
        SBI a = new SBI();
        s.getIFSC();
        i.getIFSC();
        a.getIFSC();
    }
}
class SBI {
    void getIFSC() {
        System.out.println("IFSC code of A branch of HDFC bank is: SBIXXXXX");
    }
}

class ICICI extends SBI {
    void getIFSC() {
        System.out.println("IFSC code of B branch of ICICI bank is: ICICIXXXXX");
    }
}

class HDFC extends SBI {
    void getIFSC() {
        System.out.println("IFSC code of C branch of SBI bank is: HDFCXXXXX");
    }
}