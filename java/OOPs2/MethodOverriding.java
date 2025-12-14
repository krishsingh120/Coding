public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();    // child class ka obj banaoge to child class ka func call hoga  
    }
}


class Animal {
    void eat(){
        System.out.println("eating Anything...");
    }

}


class Deer extends Animal {
    void eat(){
        System.out.println("eating grass...");
    }

}