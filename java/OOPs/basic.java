// classes & object 
// access Modifiers 
// getters & setters
// constructors

public class basic{
    public static void main(String args[]){
        Pen p1 = new Pen();  // created pen object p1.
        p1.setColor("blue");
        System.out.println("color : "+p1.getColor());
        // p1.color = "yellow";

        p1.setTip(5);
        System.out.println("Tip : "+ p1.getTip());





        Student s1 = new Student("krish singh", 20);  // by default constructor call ho jayega 
        System.out.println("Student Name : "+s1.name +" , "+ s1.age);








        // BankAccount myAcnt = new BankAccount();
        // myAcnt.username = "krishSingh";
        // System.out.println("username : "+myAcnt.username);
        // myAcnt.setPassword("singh@282005");
        // System.out.println(myAcnt.password);

    }
  
}







class BankAccount{
    public String username;
    private String password;

    public void setPassword(String newPassword){
        this.password = newPassword;
    }
}




class Pen{
    // property + function
    private String color;
    private int tip;


    String getColor(){  // setter
        return this.color;
    }

    int getTip(){   // setter
        return this.tip;
    }
    void setColor(String newColor){  // getters
        this.color = newColor;
    }
    void setTip(int newTip){   // getters
        this.tip = newTip;

    }
}


class Student{
    String name;
    int age;

    Student() {   // default constructor
        
    }


    Student(String name, int age) {   // paramerterized constructor
        // System.out.println();
        this.name = name;
        this.age = age;
    }

}