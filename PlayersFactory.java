/*
	 PlayersFactory.java (Java)
	 
	 Purpose: Player and Enemy classes factory.
	 
	 Site: https://dirack.github.io
	 
	 Version 1.0
	 
	 Programer: Rodolfo A C Neves (Dirack) 30/05/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 License: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

public class PlayersFactory{
	
	public static PongPlayer createPlayer(int i){

		if(i==1){
			return new Player();
		}else{
			return new Enemy();
		}
	}
}
