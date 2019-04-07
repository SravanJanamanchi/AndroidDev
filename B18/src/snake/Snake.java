package snake;

public class Snake {
	
	public void move(int speed) {}
	/**
	 * The snake moves at a specific speed
	 * @param direction
	 */
	public void turn(int direction) {}
	/**
	 * The snake turns in specific direction
	 */
	public void eat() {}
	/**
	 * The snake eat and it grows one tile	 */
	public void pause() {}
	/**
	 * The snake will not move as the player minimizes the game
	 */
	public void die() {}
	/**
	 * The Snake dies when there is no food or len(snake) is too large than the screen
	 */
	public void grow() {}
	/**
	 * One tile will be added to the snake
	 */
	public void shrink() {}
	/**
	 * one tile will be removed from the snake if snake bites the snake itself
	 */

}

