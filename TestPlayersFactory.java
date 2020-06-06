/*
	 TestPlayersFactory.java (Java)
	 
	 Purpose: Test of PlayersFactory class to build Players of the game.
	 
	 Site: https://dirack.github.io
	 
	 Version 1.0
	 
	 Programer: Rodolfo A C Neves (Dirack) 30/05/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 License: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestPlayersFactory{ 

	@Test
	@Tag("PongPlayerFactory")
	@DisplayName("PongPlayer Factory")
	public void testPlayersBuilder() throws IllegalArgumentException{
		
		PongPlayer player = PlayersFactory.createPongPlayer("player");
		assertNotNull(player);
		assertTrue(player instanceof Player);
	
		PongPlayer enemy = PlayersFactory.createPongPlayer("enemy");
		assertNotNull(enemy);
		assertTrue(enemy instanceof Enemy);

		assertThrows(IllegalArgumentException.class,()->{
			PlayersFactory.createPongPlayer("dummy");
		});
	}
}
