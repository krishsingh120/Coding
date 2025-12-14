public class Class_object {
    public static void main(String[] args){
        Dog d1 = new Dog();   // user define data type...
        d1.name = "jack";
        d1.bark(); // bark function call hua...
        

        Dog d2 = new Dog();
        d2.name = "leo";
        d2.walk();
    }
}


class Dog{
// properties of Dog
   String name;
   int age;
   String color;

   void walk(){
      System.out.println(name+" is walking....");
   }

   void bark(){
    System.out.println(name+" is barking....");
   }

}

