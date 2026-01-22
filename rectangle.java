class Rectanglee {
    int length;
    int breadth;
    int area;
    int perimeter;

    void showDetails() {
        System.out.println(length);
        System.out.println(breadth);
    }

    int getArea() {
        area = length * breadth;
        return area;
    }

    int getPerimeter() {
        perimeter = 2 * (length + breadth);
        return perimeter;
    }
}

public class rectangle {
    public static void main(String[] args) {
        Rectanglee r1 = new Rectanglee();
        r1.length = 10;
        r1.breadth = 5;
        r1.getArea();
        r1.getPerimeter();
        r1.showDetails();
        System.out.println(r1.area);
        System.out.println(r1.perimeter);
    }

}
