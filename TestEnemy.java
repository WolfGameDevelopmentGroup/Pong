/*
	 TestPlayer.java (Java)
	 
	 Objetivo: Tests of Enemy class.
	 
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

public class TestEnemy{

	@Test
	@Tag("EnemyMove")
	@DisplayName("Enemy move")
	public void testEnemyMove(){

		Enemy e = (Enemy) PlayersFactory.createPongPlayer("enemy");
		assertEquals(0,e.getXCoordinate());
		
		e.moveRight();
		assertEquals(1,e.getXCoordinate());
		e.moveLeft();
		assertEquals(0,e.getXCoordinate());

		e.setVelocity(10);
		e.moveRight();
		assertEquals(10,e.getXCoordinate());
		e.moveLeft();
		assertEquals(0,e.getXCoordinate());
	}

	@Test
	@Tag("EnemyMovementLimits")
	@DisplayName("Check Enemy movement limits")
	public void testEnemyTryMovementOutOfBondaries(){
		
		Enemy e = (Enemy) PlayersFactory.createPongPlayer("enemy");
		e.setXCoordinateMaximum(20);
		assertEquals(20,e.getXCoordinateMaximum());
		e.setXCoordinateMinimum(0);
		assertEquals(0,e.getXCoordinateMinimum());
		e.setVelocity(10);
		assertEquals(0,e.getXCoordinate());
		e.moveLeft();
		assertEquals(0,e.getXCoordinate());

		/* Player width is 10 and Maximum x is 20
		   so it can move Right only once and x coordinate
		   should remains 10 besides it tries to move right.*/
		e.setWidth(10);
		e.moveRight();
		e.moveRight();
		assertEquals(10,e.getXCoordinate());
	}

}
