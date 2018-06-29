public class MyAnimalList {
	
	private MyAnimalList[] animals = new MyAnimalList[5];
	private int index = 0;
	
	public void add(MyAnimalList a){
		if(index < animals.length){
			animals[index] = a;
			System.out.println("Animal added at " + index);
			index++;
		}
	}
}