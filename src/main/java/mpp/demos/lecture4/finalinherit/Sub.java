package mpp.demos.lecture4.finalinherit;

//Shows how compiler locates first ancestor
//in inheritance chain in which the final method
//is implemented
final public class Sub extends Super {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.print();
	}	
}
