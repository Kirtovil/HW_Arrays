package ru.netology.stats;


public class StatsService {

    public int sumAllSales(int[] sales) {
        int allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public int averageSumAllSales(int[] sales) {

        int averageSum = sumAllSales(sales) / sales.length;
        return averageSum;
    }

    public int maxSaleManth(int[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSaleManth(int[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int belowAverageSumAllSales (int[] sales){
        int sumMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumAllSales(sales)) {
                sumMonths++;
            }
        }
        return sumMonths;
    }

    public int aboveAverageSumAllSales (int[] sales){
        int sumMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumAllSales(sales)) {
                sumMonths++;
            }
        }
        return sumMonths;
    }
}
