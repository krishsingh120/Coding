public class Inherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.legs = 4;
        d.breed = "German Shefed";
        d.eat();
        System.out.println(d.breed);
        System.out.println(d.legs);

    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("eating...");
    }

    void breath(){
        System.out.println("breathing...");
    }
}



class Mammel extends Animal{
    int legs;
}

class Dog extends Mammel{  // Multilevel inheritance
    String breed;
}


class Bird extends Animal{  // Hierarchial inheritance
    void fly(){
        System.out.println("flying...");
    }
}
