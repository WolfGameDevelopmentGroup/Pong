/*
	 TestPlayersFactory.java (Java)
	 
	 Purpose: Test of PlayersFactory class to build Players of the game.
	 
	 Site: https://dirack.github.io
	 
	 Version 1.0
	 
	 Programer: Rodolfo A C Neves (Dirack) 30/05/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 License: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

import org.junit.Assert.*;

public class TestPlayersFactory{

	public void testPlayersBuilder(){
		PongPlayer player = PlayersFactory.createPongPlayer(1);
//		assertTrue(PlayersFactory.createPongPlayer(2));
	}
}
