Question : Polynomial Class Problem

/*
Send Feedback
Implement a polynomial class, that contains following functions -
1. setCoefficient -
This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
2. add -
Adds two polynomials and returns a new polynomial which has the result.
3. subtract -
Subtracts two polynomials and returns a new polynomial which has the result.
4. multiply -
Multiplies two polynomials and returns a new polynomial which has the result.
5. print -
Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
Print pattern for a single term : "x"
And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
Note : Only keep those terms which have non - zero coefficients.
*/

Solution :

public class Polynomial {

    private int[] degreeWithCoeff;

    public Polynomial() {
        degreeWithCoeff = new int[5];

    }

    public void setCoefficient(int degree, int coeff){
        if(degree >= degreeWithCoeff.length) {
            increaseCapacity(degree);
        }
        degreeWithCoeff[degree] = degreeWithCoeff[degree] + coeff;
    }

    private void increaseCapacity(int degree) {
        int[] temp = degreeWithCoeff;
        degreeWithCoeff = new int[degree + 1];
        for(int i = 0;i<temp.length;i++) {
            degreeWithCoeff[i] = temp[i];
        }

    }


    public void print(){
        for(int i = 0;i<degreeWithCoeff.length;i++) {
            if(degreeWithCoeff[i]!= 0) {
                System.out.print(degreeWithCoeff[i] + "x" + i + " ");
            }

        }

    }
    public Polynomial add(Polynomial p){

        if(p.degreeWithCoeff.length < this.degreeWithCoeff.length) {
            p.increaseCapacity(this.degreeWithCoeff.length - 1);
        }
        else {
            this.increaseCapacity(p.degreeWithCoeff.length - 1);
        }

        for(int i = 0;i<p.degreeWithCoeff.length;i++) {
            p.degreeWithCoeff[i] = p.degreeWithCoeff[i] + this.degreeWithCoeff[i]; 
        }

        return p;

    }
    public Polynomial subtract(Polynomial p){

        Polynomial temp = new Polynomial();

        if(p.degreeWithCoeff.length < this.degreeWithCoeff.length) {
            p.increaseCapacity(this.degreeWithCoeff.length - 1);
        }
        else {
            this.increaseCapacity(p.degreeWithCoeff.length - 1);
        }
        for(int i = 0;i<this.degreeWithCoeff.length;i++) {
            this.degreeWithCoeff[i] =  this.degreeWithCoeff[i] - p.degreeWithCoeff[i] ;
        }


        for(int i = 0; i < this.degreeWithCoeff.length; i++){
            temp.setCoefficient(i,this.degreeWithCoeff[i]);
        }

        return temp;
    }
    public Polynomial multiply(Polynomial p){
        Polynomial temp_mul = new Polynomial();
        int tempDegree;
        int tempCoeff;
        //		int maxDegreePoly = this.degreeWithCoeff.length + p.degreeWithCoeff.length;
        for(int i = 0;i<this.degreeWithCoeff.length;i++) {
            for(int j = 0;j<p.degreeWithCoeff.length;j++) {
                tempDegree = i+j;
                tempCoeff = this.degreeWithCoeff[i] * p.degreeWithCoeff[j];
                temp_mul.setCoefficient(tempDegree, tempCoeff);
            }
        }

        return temp_mul;


    }


}
