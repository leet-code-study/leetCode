package hyeontaek;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result = result | (n & 1);
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseBits solution = new ReverseBits();
        System.out.println(solution.reverseBits(43261596));
    }

}
