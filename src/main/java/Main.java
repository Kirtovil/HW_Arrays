import ru.netology.stats.StatsService;

public class Main {
    public static void main (String[] args) {
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        System.out.println(service.belowAverageSumAllSales(sale));

    }
}
