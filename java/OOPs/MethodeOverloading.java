public class MethodeOverloading {
    public static void main(String[] args){
        Greet g = new Greet();  // by default constructor is called..
        g.greetings();
        // g.name = "krish";
        g.greetings("krish");

        g.greetings("krish", 20);

 
    }
}

class Greet{
    String name;

    void greetings(){
        System.out.println("Hello, greetings...");
    }

    void greetings(int a){
        System.out.println("Hello, greetings...");
    }

    void greetings(String name){
        System.out.println(name+" Hello, greetings...");
    }

    void greetings(String name, int age){
        System.out.println("I'm "+name + " and My age is : "+age );
    }
}


