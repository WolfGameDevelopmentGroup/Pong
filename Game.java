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
	private int actualFrameNumber=0;
	private int framesPerSecondRate = 1;
	public Player player;
	public Enemy enemy;

	public Game(){
		this.player = (Player) PlayersFactory.createPongPlayer("player");
		this.enemy = (Enemy) PlayersFactory.createPongPlayer("enemy");
	}

	public void setIsRunning(boolean b){
		this.isRunning = b;
	}

	public boolean getIsRunning(){
		return this.isRunning;
	}

	public int getActualFrameNumber(){
		return this.actualFrameNumber;
	}

	public void setFramesPerSecondRate(int f){
		this.framesPerSecondRate = f;
	}

	public synchronized void start(){

		this.isRunning = true;
		this.startGameTime = System.nanoTime();
		Thread thread = new Thread(this);
		thread.start();
	}

	public void update(){
		this.player.update();
		this.enemy.update();
	}

	public void renderize(){
		this.actualFrameNumber++;
	}

	public void run(){

		while(this.isRunning){
			try{
				update();
				renderize();
				Thread.sleep(1000/this.framesPerSecondRate);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	} 
}
