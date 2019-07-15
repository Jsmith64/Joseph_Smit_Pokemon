package pokemon;


import java.util.*;

public class Pokemon implements PokemonInterface {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	HashMap<String, Pokemon> pokedex = new HashMap<String, Pokemon>();
	
	public Pokemon(String name, int health, String type) {
		
		if(pokedex.containsKey(name)) {
			this.setName(name);
			this.setHealth(health);
			this.setType(type);
			Pokemon.count++;
			pokedex.put(name, this);
		}
	}
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);	
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Pokemon Info: " + this.name + ", " + this.health + "hp, " + this.type;
	}
	public void listPokemon() {
		for(String key : pokedex.keySet()) {
			System.out.println(pokedex.get(key).name);
		}
	}
	
	void attackPokemon(Pokemon pokemon) {
		this.health -= 10;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
