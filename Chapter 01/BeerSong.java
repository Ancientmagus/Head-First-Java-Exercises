public class BeerSong {
	public static void main (String[] args) {
		// variables
		int number = 99;
		String name = "bottles";
		
		//code
		System.out.println(number + " " +  name + " of beer on the wall");
		
		while (number > 0){
			if (number == 1){
				name = "bottle";
			}
			System.out.println(number + " " + name + " of beer");
			System.out.println("take one down");
			System.out.println("pass it around!");
			
			number = number - 1;
			
			if (number == 0){
				System.out.println("No more bottles of beer on the wall");
			}else{
			System.out.println(number + " " +  name + " of beer on the wall");
			}
		}
	}
}