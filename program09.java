package program09;

public class program09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size = 36;
		int [] arr = new int [size];
		int random = (int)(Math.random()*35);
		System.out.println("random card from deck");
		displayCard(random);
		System.out.println("---------------------------");
		System.out.println("After the deck is initialated ");
		initDeck (arr);
		System.out.println("---------------------------");
		System.out.println("after its been shuffled 40 times");
		shuffleDeck(arr, 40);
		displayDeck(arr);
	}
	public static int cardValue(int card) {
		int cards =  (card % 9) +1;
		return cards;
		
	}
	//Return the integer value ( [1, 9] ) of card
	 public static String cardSuit(int card) {
		card /= 9;
		String [] suit = {"Club", "Spade", "Heart", "Diamond"};
		
		 return suit[card];
	}
	//Return the suit ( [”Club”, ”Spade”, ”Heart”, ”Diamond”] ) of card
	 public static void displayCard(int card) {
		String suit = cardSuit (card);
		int value = cardValue(card);
		System.out.println(value + " " + suit);
	}	
	//Prints card (both value and suit) in some reasonable report format.
	public static void initDeck(int[] deck) {
		String suit;
		int value;
		for (int i = 0; i < 36; ++i) {
			deck[i] = i;
			displayCard(i);
		
		}
		
	}
	//Assign the elements of deck, such that each element’s value is the same as its index.
	public static void shuffleDeck(int[] deck, int n) {
		int random;
		int random1;
		int temp;
		for (int i = 0; i < n; ++i) {
			random = (int)(Math.random()*35);
			random1 = (int)(Math.random()*35);
			temp = deck[random];
			deck[random] = deck[random1];
			deck[random1] = temp;
			
		}
	}
	//The following is performed exactly n times:
	//1. Generate two random numbers j and k - each in the range [0, 35]
	//2. Swap the values of the deck array at indicies j and k
	public static void displayDeck(int[] deck) {
		String suit;
		int value;
		for (int i = 0; i < 36; ++i) {
			displayCard(deck[i]);
		}
	//Prints the cards in deck in some reasonable report format.
	}
}
