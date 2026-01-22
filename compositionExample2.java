class point {
    int x;
    int y;

    point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "P(" + x + "," + y + ")";
    }
}

class straightLine {
    point p1;
    point p2;

    straightLine(point p1, point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    double getDistance() {
        return (Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y))));
    }
}

public class compositionExample2 {
    public static void main(String[] args) {
        point p1 = new point(10, 20);
        point p2 = new point(30, 40);
        System.out.println(p1);
        System.out.println(p2);
        straightLine s1 = new straightLine(p1, p2);
        System.out.println(s1.getDistance());
        System.out.println(s1.p1);

    }

}
