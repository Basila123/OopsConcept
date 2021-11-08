package com.bridgelabzOops;
import java.util.Scanner;
public class Stock {
        //driver code
        public static void main(String[] args) {
            StockPortfolio portfolio = new StockPortfolio();
            portfolio.PortfolioValue();
        }
    }

    /**
     * Stock class will read the no.of shares
     * and share price from the user for each Stock.
     */
    class StockAccount {
        int numberOfShares;
        double sharePrice;
        Scanner scanner = new Scanner(System.in);

        /**
         * @return stockValue of each stock is calculated based on share price and no.of shares
         */
        public double stockMethod() {
            numberOfShares = scanner.nextInt();
            sharePrice = scanner.nextDouble();
            return numberOfShares * sharePrice;
        }
    }

    /**
     * Stock portfolio class for determining the value of each stock
     * and total portfolio value of all the stocks.
     */
    class StockPortfolio {
        static int N;
        static double portfolioValue = 0;

        public void PortfolioValue() {
            StockAccount obj = new StockAccount();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter no.of stocks N: ");
            N = scanner.nextInt();
            double[] stocksValue = new double[N];
            String[] stockNames = new String[N];
            System.out.println("Enter all the stock names: ");
            for (int i = 0; i < N; i++) {
                stockNames[i] = scanner.next();
            }
            for (int i = 0; i < N; i++) {
                System.out.println("Enter " + stockNames[i] + " number of shares: and share price: ");
                stocksValue[i] = obj.stockMethod();
                portfolioValue += stocksValue[i];
            }
            for (int i = 0; i < N; i++) {
                System.out.println(stockNames[i] + " current value is " + stocksValue[i]);
            }
            System.out.println("Total portfolio value is : " + portfolioValue);
        }
    }

