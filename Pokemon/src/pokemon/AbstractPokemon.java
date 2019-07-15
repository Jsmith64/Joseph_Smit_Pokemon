package pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);	
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		return "Pokemon Info: " + pokemon.getName() + ", " + pokemon.getHealth() + "hp, " + pokemon.getType();
	}
}
