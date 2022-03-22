Question : Complex Number Problem
/*
A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
Implement the Complex numbers class that contains following functions -
1. constructor
You need to create the appropriate constructor.
2. plus -
This function adds two given complex numbers and updates the first complex number.
e.g.
if C1 = 4 + i5 and C2 = 3 +i1
C1.plus(C2) results in: 
C1 = 7 + i6 and C2 = 3 + i1
3. multiply -
This function multiplies two given complex numbers and updates the first complex number.
e.g.
if C1 = 4 + i5 and C2 = 1 + i2
C1.multiply(C2) results in: 
C1 = -6 + i13 and C2 = 1 + i2
4. print -
This function prints the given complex number in the following format :
a + ib
Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.
*/


Solution :

public class ComplexNumbers {

    private int real;
    private int imaginary;
    public ComplexNumbers(int real, int imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }
    public void print() {
        System.out.println(this.real+" " + "+" +" i" + this.imaginary) ;
    }
    public void plus(ComplexNumbers c2) {

        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
    }
  public void multiply(ComplexNumbers c2) {            ////(a+ib)*(c+id)=ac+iad+ibc-bd
		int realTemp=this.real*c2.real-this.imaginary*c2.imaginary;
		this.imaginary=this.real*c2.imaginary+this.imaginary*c2.real;
		this.real=realTemp;
	}	
	
}
