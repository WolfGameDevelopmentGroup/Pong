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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestGameFramesPerSecond{

	@Test
	@Tag("GameBuilding")
	@DisplayName("Game class Building")
	public void testGameBuilding(){
		Game game =  new Game();
		assertNotNull(game);
		game.start();
		assertTrue(game.getIsRunning());
	}

	@Test
	@Tag("FramesPerSecondRate")
	@DisplayName("Frames per second rate")
	public void testFramesPerSecondCounter(){
		Game game = new Game();
		game.start();
		assertTrue(game.getIsRunning());


		try {
			Thread.sleep(1000);

			/* Test FPS=1  */
			int d1Frame = game.getActualFrameNumber();
			final long ms = 2000;
			final int s = 2;
			Thread.sleep(ms);
			int d2Frame = game.getActualFrameNumber();
			double frames = (double)(d2Frame-d1Frame);
			assertEquals(frames,2,1);

			/* Test FPS=60 */
			game.setFramesPerSecondRate(60);
			Thread.sleep(1000);
			d1Frame = game.getActualFrameNumber();
			Thread.sleep(ms);
			d2Frame = game.getActualFrameNumber();
			double fps = (double)(d2Frame-d1Frame)/s;
			assertEquals(fps,60,2);

		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

	}
}
