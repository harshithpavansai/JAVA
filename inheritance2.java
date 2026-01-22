class Y {
    void method1() {
        System.out.println("this is method 1");
    }

    void method2() {
        System.out.println("this is method 2");
    }
}

class X extends Y {
    void method3() {
        System.out.println("this is method 3");
    }

    void method4() {
        System.out.println("this is method 4");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        X obj = new X();
        Y ob = new Y();
        System.out.println(obj instanceof X);
        System.out.println(obj instanceof Y);
        System.out.println(obj instanceof Object);
        System.out.println("--------------");
        System.out.println(ob instanceof X);
        System.out.println(ob instanceof Y);
        System.out.println(ob instanceof Object);
    }
}
