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

}
