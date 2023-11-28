package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void testSumCashOfSalesService (){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumAllSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testAveageSalesService (){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSumAllSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMaxMonthService (){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSaleManth(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testMInMonthService (){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSaleManth(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testBelowAverageService (){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSumAllSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testAboveAverageService (){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSumAllSales(sales);
        Assertions.assertEquals(expected, actual);

    }
}
