public class PhraseOMatic {
	public static void main (String [] args){
		//all words
		String[] WordListOne = {"24/7" , "multi-Tier" , "30,000 foot" , "B-to-B" , "win-win" , "front-end" , " web-based", "pervasive" , "smart" , "six-sigma" , "critical-path" , "dynamic"};
		String[] WordListTwo = {"empowered", "sticky", "value-added", "oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
		String[] WordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
		
		//count the number of words in each string
		int oneLength = WordListOne.length;
		int twoLength = WordListTwo.length;
		int threeLength = WordListThree.length;
		
		//generate three random numbers
		int rand1 = (int)(Math.random()*oneLength);
		int rand2 = (int)(Math.random()*twoLength);
		int rand3 = (int)(Math.random()*threeLength);
		
		//build a phrase
		String phrase = WordListOne[rand1] + " " + WordListTwo[rand2] + " " + WordListThree[rand3];
		
		//print out phrase
		System.out.println("What we need is a " + phrase);
	}
}