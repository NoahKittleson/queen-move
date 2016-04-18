
public class QueenMove {
  public static void main(String[] args) {

  }

  public static Boolean queenMove(int startX, int startY, int finishX, int finishY) {
    if (startY == finishY || startX == finishX) {
      return true;
    } else if (Math.abs(startY - finishY) == Math.abs(startX - finishX)) {
      return true;
    } else {
      return false;
    }
  }
}
