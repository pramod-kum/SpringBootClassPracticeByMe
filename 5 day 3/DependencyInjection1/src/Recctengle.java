public class Recctengle implements Shapes{
    private int length;
    private int breadth;

    public Recctengle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    @Override
    public void getArea(){
        System.out.println(length * breadth);
    }
}
