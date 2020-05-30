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
	
	public static PongPlayer createPongPlayer(String type) throws IllegalArgumentException{

		try{
			if(type == "player"){
				return new Player();
			}else if(type == "enemy"){
				return new Enemy();
			}else{
				throw new IllegalArgumentException("CreatePongPlayer: Argument of this factory method can be \'player\' or \'enemy\' only\nReturned null");
			}
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
