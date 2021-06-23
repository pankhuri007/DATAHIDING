class Rectangle{
    private int length;
    private int breath;

    public void setLength(int l) {
        this.length = l;
    }
    public void setBreath(int b){
        this.breath=b;
    }
    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
    public void area(){
        System.out.println("Area ="+ length*breath);
    }
    public void perimeter(){
        System.out.println("Perimeter ="+ (2*getBreath()*getLength()));
    }
}



public class Demo {
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        r1.setBreath(10);
        r1.setLength(30);
        System.out.println("Length of rectangle: "+r1.getLength());
        System.out.println("Breath of rectangle: "+ r1.getBreath());
        r1.area();
        r1.perimeter();
    }
}
