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
import junit.framework.TestCase;

public class TestPlayersFactory extends TestCase{

	/* Test building in Players Factory */
	public void testPlayersBuilder(){
		
		PongPlayer player = PlayersFactory.createPongPlayer(1);
		assertNotNull(player);
		assertTrue(player instanceof Player);
	
		PongPlayer enemy = PlayersFactory.createPongPlayer(2);
		assertNotNull(enemy);
		assertTrue(enemy instanceof Enemy);
	}
}
