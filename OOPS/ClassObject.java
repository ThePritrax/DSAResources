package OOPS;

class Complex {
    int real, imag;

    Complex(int real, int imag){
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex num){
        real += num.real;
        imag += num.imag;
        return this;
    }

    void print(){
        System.out.println(real + " + " + imag + "i");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Complex num1 = new Complex(20,40);
        Complex num2 = new Complex(15, 25);
        num1.print();
        num2.print();
        System.out.print("Result after addition : ");
        num1.add(num2).print();
    }
}
