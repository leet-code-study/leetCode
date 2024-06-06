package hyeontaek;

public class AddDigits {

  public static void main(String[] args) {
    AddDigits solution = new AddDigits();
    int n = 1234;
    System.out.println(solution.addDigits(n));
  }

  public int addDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    if (sum < 10) {
      return sum;
    }
    return addDigits(sum);
  }

}
