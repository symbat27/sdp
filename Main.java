package report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report.Builder()
                .title("1st assignment")
                .author("Zhuman Symbat")
                .date("2025-09-14")
                .content("This is 1st assignment of Software Design Patterns course.")
                .build();

        System.out.println(report);
    }
}
