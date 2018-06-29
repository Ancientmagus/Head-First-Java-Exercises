public class MyDogList {
	private Dog[] dogs = new Dog[5];
	private int Index = 0;
	
	public void add(Dog a){
		if (Index < dogs.length){
			dogs[index] = a;
			System.out.println("Dog added at " + Index);
			nextIndex++;
		}
	}
}
	