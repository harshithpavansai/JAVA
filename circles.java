class Circle {
    double radius;
    double diameter;
    double area;

    double getDiameter() {
        diameter = 2 * radius;
        return diameter;
    }

    double getArea() {
        area = (3.14) * radius * radius;
        return area;
    }

    void displayDetails() {
        System.out.println(radius);
        System.out.println(diameter);
        System.out.println(area);
    }

}

public class circles {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5;
        c1.getDiameter();
        c1.getArea();
        c1.displayDetails();
    }

}
