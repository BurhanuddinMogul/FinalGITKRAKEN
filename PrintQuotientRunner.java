public class PrintQuotientRunner{
	public static void main(String[]args){

		Partner2 p = (float f1, float f2)-> {
			float q = f1/f2;
			System.out.printf("%.3f", q);
		};
		p.quotient(3,4);

	}
}