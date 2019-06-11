public class Runner{

    public static void main(String[]args){

        Perfect_Square pS = (int x)-> {
			double root = Math.sqrt(x);
			return (root - Math.floor(root) == 0);
		};

        Partner2 p = (float f1, float f2)-> {
			float q = f1/f2;
			System.out.printf("%.3f", q);
		};
		p.quotient(3,4);

    }

}

//I learned that GitKraken is way too complicated for me to use.  Also Lambda Expressions.