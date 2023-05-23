public class AreaCalculator {
    Trangle t;

    public AreaCalculator(Trangle t) {
        this.t = t;
    }

    void printArea(){
        System.out.println(0.5*t.getBase()*t.getHeight());
    }
}
