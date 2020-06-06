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

	private int xCoordinate = 0;
	private int yCoordinate = 0;
	private int velocity = 1;
	private int xCoordinateMaximum = 10;
	private int xCoordinateMinimum = 0;
	private int width = 0;

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

	public void setXCoordinateMaximum(int xmax){
		this.xCoordinateMaximum = xmax;
	}

	public void setXCoordinateMinimum(int xmin){
		this.xCoordinateMinimum = xmin;
	}

	public int getXCoordinateMaximum(){
		return this.xCoordinateMaximum;
	}

	public int getXCoordinateMinimum(){
		return this.xCoordinateMinimum;
	}

	public int getWidth(){
		return this.width;
	}

	public void setWidth(int w){
		this.width = w;
	}

	public void update(){}

	public void moveLeft(){
		if((this.xCoordinate - this.velocity) < this.xCoordinateMinimum){
			this.xCoordinate = this.xCoordinateMinimum;
			return;
		}

		this.xCoordinate -= this.velocity;
	}

	public void moveRight(){
		if((this.xCoordinate + this.width + this.velocity) > this.xCoordinateMaximum){
			this.xCoordinate = (this.xCoordinateMaximum - this.width);
			return;
		}

		this.xCoordinate += this.velocity;
	}

	public void draw(){}

}
