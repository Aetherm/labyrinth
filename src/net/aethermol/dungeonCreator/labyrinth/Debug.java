package net.aethermol.dungeonCreator.labyrinth;


public class Debug
{
	public static void main(String[] args)
	{	
		int indices = 16;
		if(args.length >= indices)
		{
			String seed = args[0];
			int id = Integer.parseInt(args[1]);
			
			int width 				= Integer.parseInt(args[2]);
			int height 				= Integer.parseInt(args[3]);
			int cellsX				= Integer.parseInt(args[4]);
			int cellsY				= Integer.parseInt(args[5]);
			int mapBorderX			= Integer.parseInt(args[6]);
			int mapBorderY			= Integer.parseInt(args[7]);
			int cellWidth			= Integer.parseInt(args[8]);
			int cellHeight			= Integer.parseInt(args[9]);
			int minChamberWidth		= Integer.parseInt(args[10]);
			int minChamberHeight	= Integer.parseInt(args[11]);
			int createCellOdd		= Integer.parseInt(args[12]);
			int cellMinimum			= Integer.parseInt(args[13]);
			int minCellCut			= Integer.parseInt(args[14]);
			int cutProbability		= Integer.parseInt(args[15]);
			
//			MapDetails mapDetails = new MapDetails(54, 30, 6, 4, 1, 1, 6, 4, 5, 4, 4, 3, 0, 2);
			
			MapDetails mapDetails = new MapDetails(width, height, cellsX, cellsY, mapBorderX, mapBorderY, cellWidth, cellHeight, minChamberWidth, minChamberHeight, createCellOdd, cellMinimum, minCellCut, cutProbability);
			MapBuilder mapBuilder = new MapBuilder(mapDetails, seed);
			
			DungeonMap map = null;
			
			for(int i = 0; i <= id; i++)
			{
				map = new DungeonMap(mapBuilder);
			}
			
			System.out.println(map);
		}
	}
}
