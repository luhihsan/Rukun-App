package rukunapps;

public class DataVoting {
    private int A,B;
    
    public DataVoting(){
        System.out.println(A);
        System.out.println(B);
    }
    
    public DataVoting(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }


}

   