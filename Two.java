
public class Two {

	public static void main(String[] args) {

		int [] num = {6,18,21,1,72,13};

		int largest = num[0];

		for (int i = 0; i < 6; i++ ) {
			if(num[i]> largest) {
				largest = num[i];
			}
		}
		
		System.out.println(largest);
	}

}
