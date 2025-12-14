public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        Kangaroo k = new Kangaroo();
        
    }
}


// parent class sirf ek idea deti hai or uski implementation child class pe depend krti hai but abstract class ka constructor create kr sakte hai...

abstract class A{  // obj create ni hoga 

    String color = "pink";

    A() {
        System.out.println("A constructor called...");
    }

    void eat(){   // non-abstract func
        System.out.println("Eating");
    }

    abstract void walk();  // without implementation (abstract func)
}

class Horse extends A{


    Horse(){
        System.out.println("Horse constructor called...");
    }

    void walk(){
        System.out.println("Walk on 4 legs...");
    }

    void changeColor(){ 
        color = "blue";
        System.out.println(color);
    }    
}


class Kangaroo extends Horse{

    Kangaroo(){
        System.out.println("Kangaroo constructor called...");
    }

    void walk(){
        System.out.println("Walk on 2 legs...");
    }
}