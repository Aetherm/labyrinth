package net.aethermol.dungeonCreator.labyrinth;

public class Example
{
	public static void main(String[] args)
	{
		MapDetails mapDetails = new MapDetails(54, 30, 6, 4, 1, 1, 6, 4, 5, 4, 4, 3, 0, 2);
		
		String seed = "someSeed";
		
		MapBuilder mapBuilder = new MapBuilder(mapDetails, seed);
		
		DungeonMap map = new DungeonMap(mapBuilder);
		
		System.out.println(map);
	}
}
