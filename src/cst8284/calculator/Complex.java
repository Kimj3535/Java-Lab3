package cst8284.calculator;

public class Complex {
	private double real = 0;
	private double imag = 0;
	
	
	// Complex constructor that takes in a single string, e.g. "2-4i"
	public Complex(String cStr){
		this(cStr.split("(?=\\+)|(?=\\-)"));  // splits cStr at + or - into an 
		// array of strings having two elements.  The first element of the 
		// resultant array will be the real portion, while the second is the 
		// imaginary portion.  This array is passed to the next constructor.
	}
	
	
	// Complex constructor that takes in an array of two strings from the above 
	// constructor e.g. cStr[0]="2", cStr[1]="-4i"
	public Complex(String[] cStr){
		this(cStr[0] , cStr[1]);
				
	}

	
	// Complex constructor that takes two separate strings as parameters, e.g. "2" and "-4i"
	public Complex(String r, String i){
			this(Integer.parseInt(r), Integer.parseInt(i.indexOf("i")==-1? i: i.substring(0,i.indexOf("i"))));
		
	}
	
	
	// Complex constructor that takes in two ints as parameters, e.g. 2 and -4
	public Complex(int r, int i){
		this((double)r,(double)i);
		
	}
	
	
	// Complex constructor that takes in two ints and stores them as floats, e.g. as 2.0 and -4.0
	public Complex(double r, double i){
		setReal(r);
		setImag(i);
	}
	
	//default Complex constructor; it will chain automatically to the (int, int) constructor
	public Complex(){this(0,0);	}
		
	
	public double getReal() {
		return this.real;
	}
	
	
	public double getImag() {
		return this.imag;
	}
	
	
	public void setReal(double real) {
		this.real = real;
	}
	
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	
	public Complex getComplex() {
		return this;
	}
	
   
	public String toString() {
		String sign = "+";
		if(getImag()<0) {
			sign = "-";
			setImag(getImag()*-1);
		}
		return getReal()+sign+getImag()+"i";
	}


	public boolean isZero() {  
		return (0==getReal() && 0==getImag());
		
	
	}


	
	}
	
	// OPTIONAL TODO: if attempting Bonus A, put your public isZero() method, with 
	// one-line return statement, here.  Be sure to use it in your divide() method
	// to ensure the user isn't trying to divide by 0.0 + 0.0i
		
	
	// OPTIONAL TODO: if attempting Bonus C, write the method to return the complex 
	// conjugate of this Complex number.  Then use the public conjugate() method with 
	// the complex multiplication to perform the division as explained in the Bonus
	// section, rather than using the equation for division given in the Lab 3 Appendix.

