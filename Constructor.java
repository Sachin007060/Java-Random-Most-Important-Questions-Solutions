public class Constructor {
    int length, height, breadth;

    public Constructor(){
        length = 10;
        height = 20;
        breadth = 12;
    }
    // public Constructor(int l, int b, int h){
    //     length = l;
    //     breadth = b;
    //     height = h;
    // }
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        // Constructor c2 = new Constructor(4,19,12);
        System.out.println(c1.length+ " "+ c1.height+ " "+c1.breadth);
        // System.out.println(c2.length+ " "+ c2.height+ " "+c2.breadth);
    }
}
