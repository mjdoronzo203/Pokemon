
public class Pokemon extends Pokedex {
	private String name;
	private int health;
	private String type;
	private static int count;
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
		int currentHP = pokemon.health;
		System.out.println(pokemon.name + " was attacked!: -10 HP");
	}
	
	public Pokemon(String name, int health, String type) {
		setName(name);
		setHealth(health);
		setType(type);
		count++;
	}
	
	public String getName() {
		String pokemon = this.name;
		return pokemon;
	}
	
	public int getHealth() {
		int HP = this.health;
		return HP;
	}
	
	public String getType() {
		String pokeType = this.type;
		return pokeType;
	}
	
	private void setName(String pokeName) {
		this.name = pokeName;
	}
	
	private void setHealth(int HP) {
		this.health = HP;
	}
	
	private void setType(String pokeType) {
		this.type = pokeType;
	}
	
}
