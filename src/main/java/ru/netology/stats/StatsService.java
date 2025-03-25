package ru.netology.stats;

public class StatsService {

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i =0; i < sales.length; i++) {
            if (sales [i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSumSales(long[] sales) {
        long averageSum = 0;
        for (long ignored : sales) {
            averageSum = (sumSales(sales) / 12);
        }
        return averageSum;
    }

    public long belowTheAverageSales(long[] sales) {
        int month = 0;
        long average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public long aboveTheAverageSales(long[] sales) {
        int month = 0;
        long average = averageSumSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}
