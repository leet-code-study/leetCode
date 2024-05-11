package hyeontaek;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;
            sb.append((char) ('A' + n % 26));
            n /= 26;
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        System.out.println(solution.convertToTitle(701));
    }

}
