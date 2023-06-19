
/**
 * @author Nick Nikolov
 **
 *
 *Class Name: Tile
 *
*The class Tile represents a tile used in the board game Scrabble, 
*each tile contains a letter and a point value 
*and allows for the comparison between two tiles to check for equivalence */

public class Tile {
	char letter;
	int value;
	
	Tile() {
		letter = 'A';
		value = 1;
	}
	
	Tile (char l, int v) {
		this.letter = l;
		this.value = v;
	}
	
	public String toString () {
		return (letter + "[" + value + "]");
	}
	
	boolean equals(Tile b) {
		if (this.value == b.value && this.letter == b.letter) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Tile tile0 = new Tile('A', 1);
		Tile tile1 = new Tile('A', 1);
		Tile tile2 = new Tile('Z', 10);

		System.out.println("Tile 0: " + tile0.toString());
		System.out.println("Tile 1: " + tile1.toString());
		System.out.println("Tile 2: " + tile2.toString());
		
		System.out.println("Tile 0 is equal to Tile 1 is " + tile0.equals(tile1));
		System.out.println("Tile 0 is equal to Tile 2 is " + tile0.equals(tile2));
	}
}
