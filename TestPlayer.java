/*
	 TestPlayer.java (Java)
	 
	 Objetivo: Tests of Player class.
	 
	 Site: https://dirack.github.io
	 
	 Versão 1.0
	 
	 Programador: Rodolfo A C Neves (Dirack) 06/06/2020
	 
	 Email: rodolfo_profissional@hotmail.com
	 
	 Licença: GPL-3.0 <https://www.gnu.org/licenses/gpl-3.0.txt>.
*/

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestPlayer{

	@Test
	@Tag("PlayerMove")
	@DisplayName("Player move")
	public void testPlayerMove(){

		Player p = (Player) PlayersFactory.createPongPlayer("player");
		assertEquals(0,p.getXCoordinate());
		
		p.moveRight();
		assertEquals(1,p.getXCoordinate());
		p.moveLeft();
		assertEquals(0,p.getXCoordinate());

		p.setVelocity(10);
		p.moveRight();
		assertEquals(10,p.getXCoordinate());
		p.moveLeft();
		assertEquals(0,p.getXCoordinate());
	}

	@Test
	@Tag("PlayerMovementLimits")
	@DisplayName("Check Player movement limits")
	public void testPlayerTryMovementOutOfBondaries(){
		
		Player p = (Player) PlayersFactory.createPongPlayer("player");
		p.setXCoordinateMaximum(20);
		assertEquals(20,p.getXCoordinateMaximum());
		p.setXCoordinateMinimum(0);
		assertEquals(0,p.getXCoordinateMinimum());
		p.setVelocity(10);
		assertEquals(0,p.getXCoordinate());
		p.moveLeft();
		assertEquals(0,p.getXCoordinate());

		/* Player width is 10 and Maximum x is 20
		   so it can move Right only once and x coordinate
		   should remains 10 besides it tries to move right.*/
		p.setWidth(10);
		p.moveRight();
		p.moveRight();
		assertEquals(10,p.getXCoordinate());
	}

}
