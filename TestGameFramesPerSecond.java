/*
	 TestGameFramesPerSecond.java (Java)
	 
	 Purpose: Test class Game build and if it is running with
	 correct frames per second tax.
	 
	 Site: https://dirack.github.io
	 
	 Version 1.0
	 
	 Programer: Rodolfo A C Neves (Dirack) 31/05/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 License: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

import org.junit.Assert.*;
import junit.framework.TestCase;

public class TestGameFramesPerSecond extends TestCase{

	/* Test Game Frames per Second control */
	public void testFramesPerSecondCounter(){
		Game game =  new Game();
		assertNotNull(game);
		game.start();
		assertTrue(game.getIsRunning());
	}
}
