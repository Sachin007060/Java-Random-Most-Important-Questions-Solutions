
class Box {
    private int Length, Breadth, Height;

    public void setDimension(int l, int b, int h) {
        Length = l;
        Breadth = b;
        Height = h;
    }

    public void showDimension() {
        System.out.println("Length:-" + Length);
        System.out.println("Breadth:- " + Breadth);
        System.out.println("Height:- " + Height);
        System.out.println();
    }
}

class ClassAndObjects {
    public static void main(String[] args) {
        Box smallBox = new Box();
        smallBox.setDimension(12, 13, 14);
        smallBox.showDimension();

        smallBox = new Box();
        smallBox.showDimension();
    }
}