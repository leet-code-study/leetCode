package hyeontaek;

public class NimGame {

  public static void main(String[] args) {
    NimGame solution = new NimGame();
    int n = 5;
    System.out.println(solution.canWinNim(n));
  }

  public boolean canWinNim(int n) {
    return n % 4 != 0;
  }
}
