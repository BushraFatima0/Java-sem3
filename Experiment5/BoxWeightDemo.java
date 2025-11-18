class Box {
    float width, height, depth;

    Box() {}
    Box(float w, float h, float d) {
        width = w; height = h; depth = d;
    }
    Box(Box b) {
        width = b.width; height = b.height; depth = b.depth;
    }

    void displayVolume() {
        System.out.println("Volume: " + (width * height * depth));
    }
}
class BoxWeight extends Box {
    float weight;

    BoxWeight() {}
    BoxWeight(float w, float h, float d, float m) {
        super(w, h, d);
        weight = m;
    }
    BoxWeight(BoxWeight bw) {
        super(bw);
        weight = bw.weight;
    }

    void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}
public class BoxWeightDemo {
    public static void main(String[] args) {
        System.out.println("Bushra 24csu265");
        BoxWeight bw1 = new BoxWeight(2, 3, 4, 5);
        System.out.println("Box 1");
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1);
        System.out.println("Box 2 (copy of bw1)");
        bw2.displayVolume();
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight();
        bw3.width = 1; bw3.height = 2; bw3.depth = 3; bw3.weight = 4;
        System.out.println("Box 3");
        bw3.displayVolume();
        bw3.displayWeight();
    }
}
