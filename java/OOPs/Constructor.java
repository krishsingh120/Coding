public class Constructor {
    public static void main(String[] args){
        Complex num1 = new Complex(2, 3);
        Complex num2 = new Complex(7, 11);

        // Complex num = new Complex();
        // num1.a = 5;
        // num1.b = 7;
        num1.print();
        num2.print();
        System.out.println("adding two numbers");
        Complex result = num1.add(num2);  
        System.out.println(num1);// num1 ka  refrence print hoga 
        result.print();

    }
}



class Complex{
    int a, b;




    // public Complex(){   // default constructor
    //     a = 2;
    //     b = 6;
    //     System.out.println("creating a new object...");
    // }


    
    public Complex(int real){   // overloading constructor
        a = real;
        b = 17;
    }
    



    public Complex(int real, int img){   
        this.a = real;
        this.b = img;
    }
    

    void print(){
        System.out.println(a+" + "+b+"i");
    }

    Complex add(Complex num2){
        this.print();  // num1 print hoga 
        Complex newNum = new Complex(a+num2.a, b+num2.b);
        return newNum;
    }




} 
