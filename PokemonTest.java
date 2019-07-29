
public class PokemonTest {

	public static void main(String[] args) {
		
		Pokedex dex1 = new Pokedex();
		Pokemon chikorita = new Pokemon("Chikorita", 50, "grass");
		Pokemon cyndaquil = new Pokemon("Cyndaquil", 60, "fire");
		Pokemon totodile = new Pokemon ("Totodile", 80, "water");
		
		dex1.addPokemon(chikorita);
		dex1.addPokemon(cyndaquil);
		dex1.addPokemon(totodile);
		
		System.out.println(cyndaquil.getHealth());
		
		chikorita.attackPokemon(cyndaquil);
		
		System.out.println(cyndaquil.getHealth());
		
		totodile.attackPokemon(cyndaquil);
		
		System.out.println(cyndaquil.getHealth());
		
		dex1.listPokemon();

	}

}
