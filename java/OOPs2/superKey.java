public class superKey {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}


class Animal{
    String color;
    
    Animal(){
        System.out.println("Animal calling...");
    }
}



class Horse extends Animal{
    Horse(){
        super();
        super.color = "pink";   // parent ki property ko access krega
        System.out.println("Horse calling...");
    }
}