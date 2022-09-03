package finalkeyword;

//class OtherClass extends FinalKeywordConcept () {}

final public class FinalKeywordConcept {
	final int MIN = 0;
	final int MAX;		//final variable should be capital, good practice
	static final double PI = 3.43252;

	// CONSTRUCTOR CLASS
	FinalKeywordConcept() {

		MAX = 6;
	}

//	void changeMAX() {
//		
//		MAX = 7;	//can't change cos final int MAX;
//	}
	
	
	final public void sayHi() {
		System.out.println("hi everyone");
	}
	
	public static void main(String[] args) {

		FinalKeywordConcept f = new FinalKeywordConcept();
		System.out.println(f.MAX);
		f.sayHi();

	}

}
