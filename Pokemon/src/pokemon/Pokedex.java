package pokemon;

public class Pokedex extends AbstractPokemon{
	
	public void listPokemon() {
		for(String key : pokedex.keySet()) {
			System.out.println(pokedex.get(key).name);
		}
	}

}
