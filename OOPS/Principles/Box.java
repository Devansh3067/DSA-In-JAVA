package OOPS.Principles;

public class Box {
    double h;
    double w;
    double l;

    Box() {
        h = 0;
        w = 0;
        l = 0;
    }

    Box(double side) {
        this.h = side;
        this.w = side;
        this.l = side;
    }

    Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box other) {
        this.h = other.h;
        this.w = other.w;
        this.l = other.l;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = 0;
    }

    BoxWeight(double h, double w, double l, double weight) {
        super(h, w, l);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }
}

class BoxPrice extends BoxWeight {
    double price;

    BoxPrice() {
        price = 0;
    }

    BoxPrice(double h, double w, double l, double weight, double price) {
        super(h, w, l, weight);
        this.price = price;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.price = other.price;
    }
}
