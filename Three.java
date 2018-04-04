
public class Three {

	public static void main(String[] args) {

		int [] num = {18,21,2,12,70,60};

		int smallest = num[0];
		int secsml = num[1];

		for (int i = 0; i < num.length; i++) {
			if(smallest > num[i]) {
				smallest = num[i];
			}
		}

		for (int i = 0; i < num.length; i ++) { 
			if(num[i] < secsml && num[i] > smallest) {
				
				secsml = num[i];
				
			}
		}

		System.out.println(secsml);
	}

}

