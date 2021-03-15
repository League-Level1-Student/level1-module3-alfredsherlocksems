package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld_runner {

	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bobTheBug = new Bug();
		Bug beatriceTheBug = new Bug();
		beatriceTheBug.setColor(Color.blue);
		for (int i = 0; i < 2; i++) {
			beatriceTheBug.turn();
		}
		Location Santamana = new Location(3, 7);
		Random ran = new Random();
		int num = ran.nextInt(10);
		int num1 = ran.nextInt(10);
		Location Random = new Location(num, num1 );
		world.add(Santamana, bobTheBug);
		world.add(Random, beatriceTheBug);
		Flower pinkFlower = new Flower();
		Flower blueFlower = new Flower(Color.blue);
		Location leftSideFlower = new Location(num, num1 - 1);
		Location rightSideFlower = new Location(num, num1 + 1);
		world.add(leftSideFlower, pinkFlower);
		world.add(rightSideFlower, blueFlower);
		Flower flowerColors;
		
		for (int y = 0; y < 10; y++) {
			
			for (int x = 0; x < 10; x++) {
				Location restOfGrid = new Location(x, y);
				if (x % 2 == 0) {
					flowerColors = pinkFlower;
				}
				else {
					flowerColors = blueFlower;
				}
				world.add(restOfGrid, flowerColors);
			}
			
		}
		
	}
	}

