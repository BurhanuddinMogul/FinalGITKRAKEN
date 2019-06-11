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

	//Burhanuddin - I learned how to use gitkraken. I was able to learn what git is and start to undersdatnd git flow. I learned how
	//to create multiple branches and merge them onto the master branch. I also learned how to use lambda expressions in java.

}

//I learned that GitKraken is way too complicated for me to use.  Also Lambda Expressions.