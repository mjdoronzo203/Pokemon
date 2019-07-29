import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	ArrayList<Object> myPokemon = new ArrayList<Object>();
	
	public void addPokemon(Pokemon pokemon) {
		String pokeName = pokemon.getName();
		int HP = pokemon.getHealth();
		String pokeType = pokemon.getType();
		myPokemon.add(pokeName + " - health: " + HP + "; type: " + pokeType + ".");
	}
	
	public void listPokemon() {
		for(int i=0; i<myPokemon.size(); i++) {
			System.out.println((i + 1) + ") " + myPokemon.get(i));
		}
	}
}
