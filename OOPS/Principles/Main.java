package OOPS.Principles;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(3.3, 4.2, 5.6);
        System.out.println("Box 1 = " + box1.h + " " + box1.w + " " + box1.l);
        BoxWeight box2 = new BoxWeight(3.3, 4.2, 5.6, 22.3);
        System.out.println("Box 2 = " + box2.h + " " + box2.w + " " + box2.l + " " + box2.weight);
        BoxPrice box3 = new BoxPrice(3.3, 4.2, 5.6, 22.3, 200.45);
        System.out.println("Box 3 = " + box3.h + " " + box3.w + " " + box3.l + " " + box3.weight + " " + box3.price);

        BoxPrice newBox = new BoxPrice(box3);
        System.out.println("The new Box (copy of box 3) = " + newBox.h + " " + newBox.w + " " + newBox.l + " " + newBox.weight + " " + newBox.price);
    }
}
