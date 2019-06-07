public class Perfect_Square_Runner{
	public static void main(String[]args){

		Perfect_Square pS = (int x)-> {
			double root = Math.sqrt(x);
			return (root - Math.floor(root) == 0);
		};

	}
}