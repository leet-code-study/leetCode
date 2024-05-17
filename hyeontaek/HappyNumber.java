package hyeontaek;

public class HappyNumber {
    public boolean isHappy(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (int) Math.pow(n % 10, 2);
            n /= 10;
        }
        if (sum == 1) return true;
        if (sum == 4) return false;
        return isHappy(sum);
    }
    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        System.out.println(solution.isHappy(19));
    }

}
