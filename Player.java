/*
	 Player.java (Java)
	 
	 Purpose: Player of the game. Controled by user.
	 
	 Site: https://dirack.github.io
	 
	 Version 1.0
	 
	 Programer: Rodolfo A C Neves (Dirack) 30/05/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 License: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

public class Player implements PongPlayer{

	private int xCoordinate;
	private int yCoordinate = 0;
	private int velocity = 1;

	public int getXCoordinate(){
		return this.xCoordinate;
	}

	public int getYCoordinate(){
		return this.yCoordinate;
	}

	public void setVelocity(int v){
		this.velocity = v;
	}

	public int getVelocity(){
		return this.velocity;
	}

	public void update(){}

	public void moveLeft(){
		this.xCoordinate -= this.velocity;
	}

	public void moveRight(){
		this.xCoordinate += this.velocity;
	}

	public void draw(){}

}
