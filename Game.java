/*
	 Game.java (Java)
	 
	 Purpose: Pong Player Game class. Main loop of a game.
	 
	 Site: https://dirack.github.io
	 
	 Version 1.0
	 
	 Programer: Rodolfo A C Neves (Dirack) 30/05/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 License: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

public class Game implements Runnable{

	private boolean isRunning;
	private long startGameTime;
	private int actualFrame=0;
	private int fps = 1;

	public void setIsRunning(boolean b){
		this.isRunning = b;
	}

	public boolean getIsRunning(){
		return this.isRunning;
	}

	public int getActualFrame(){
		return this.actualFrame;
	}

	public void setFPS(int f){
		this.fps = f;
	}

	public synchronized void start(){

		this.isRunning = true;
		this.startGameTime = System.nanoTime();
		Thread thread = new Thread(this);
		thread.start();
	}

	public void update(){
	}

	public void renderize(){
	}

	public void run(){

		while(this.isRunning){
			update();
			renderize();
		}
	} 
}
