class Square {
    int side;
    int area;
    int perimeter;

    void calArea() {
        area = side * side;
    }

    void calperimeter() {
        perimeter = 4 * side;
    }
}

public class OOPSExample {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.side = 10;
        s1.calArea();
        s1.calperimeter();
        System.out.println(s1.area);
        System.out.println(s1.perimeter);
    }

}
