package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i =0; i < sales.length; i++) {
            if (sales [i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int averageSum = 0;
        for (long ignored : sales) {
            averageSum = (sumSales(sales) / 12);
        }
        return averageSum;
    }

    public int belowTheAverageSales(long[] sales) {
        int month = 0;
        int average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int aboveTheAverageSales(long[] sales) {
        int month = 0;
        int average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}
