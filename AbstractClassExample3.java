abstract class enemy {
    abstract void spawn();

    abstract void attack();
}

abstract class BossEnemy extends enemy {
    void spawn() {
        System.out.println("Boss Enemy is making a tremendous enterence");
    }
}

class dragon extends BossEnemy {
    void attack() {
        System.out.println("spitting fireee");
    }
}

class assassin extends BossEnemy {
    void attack() {
        System.out.println("shoots bullets");
    }
}

public class AbstractClassExample3 {
    public static void main(String[] args) {
        BossEnemy b1 = new dragon();
        b1.spawn();
        b1.attack();
        BossEnemy b2 = new assassin();
        b2.attack();

    }

}
