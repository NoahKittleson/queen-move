import org.junit.*;
import static org.junit.Assert.*;

public class QueenMoveTest {

  @Test
  public void isQueenMove_forHorizontalPieces_Boolean() {
    QueenMove testQueenMove = new QueenMove();
    assertEquals(true, testQueenMove.queenMove(4, 0, 1, 0));
  }

  @Test
  public void isQueenMove_forVerticalPieces_Boolean() {
    QueenMove testQueenMove = new QueenMove();
    assertEquals(true, testQueenMove.queenMove(0, 4, 0, 1));
  }

  @Test
  public void isQueenMove_forDiagonalPieces_Boolean() {
    QueenMove testQueenMove = new QueenMove();
    assertEquals(true, testQueenMove.queenMove(1, 3, 4, 6));
  }
}

//subtract or add same amount to both numbers = diagonal


//-horizontal
//-vertical
//-diagonal
