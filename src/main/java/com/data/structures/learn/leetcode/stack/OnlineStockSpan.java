package com.data.structures.learn.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.
 * <p>
 * The span of the stock's price in one day is the maximum number of consecutive days (starting from that day and going backward) for which the stock price was less than or equal to the price of that day.
 * <p>
 * For example, if the prices of the stock in the last four days is [7,2,1,2] and the price of the stock today is 2, then the span of today is 4 because starting from today, the price of the stock was less than or equal 2 for 4 consecutive days.
 * Also, if the prices of the stock in the last four days is [7,34,1,2] and the price of the stock today is 8, then the span of today is 3 because starting from today, the price of the stock was less than or equal 8 for 3 consecutive days.
 * Implement the onlineStockSpan class:
 * <p>
 * onlineStockSpan() Initializes the object of the class.
 * int next(int price) Returns the span of the stock's price given that today's price is price.
 * <p>
 * Example 1:
 * <p>
 * Input
 * <p>
 * ["onlineStockSpan", "next", "next", "next", "next", "next", "next", "next"]
 * <p>
 * [[], [100], [80], [60], [70], [60], [75], [85]]
 * <p>
 * Output
 * <p>
 * [null, 1, 1, 1, 2, 1, 4, 6]
 * <p>
 * Explanation:
 * <p>onlineStockSpan onlineStockSpan = new onlineStockSpan();
 * <p>onlineStockSpan.next(100); // return 1
 * <p>onlineStockSpan.next(80);  // return 1
 * <p>onlineStockSpan.next(60);  // return 1
 * <p>onlineStockSpan.next(70);  // return 2
 * <p>onlineStockSpan.next(60);  // return 1
 * <p>onlineStockSpan.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
 * <p>onlineStockSpan.next(85);  // return 6
 */
public class OnlineStockSpan {

    Deque<Integer> prices;
    Deque<Integer> span;

    public OnlineStockSpan() {
        this.prices = new ArrayDeque<>();
        this.span = new ArrayDeque<>();
    }

    public int next(int price) {
        int spanDays = 1;
        while (!prices.isEmpty() && prices.peekLast() <= price) {
            spanDays = span.pollLast() + spanDays;
            prices.pollLast();
        }

        prices.offerLast(price);
        span.offerLast(spanDays);
        System.out.println(spanDays);
        return spanDays;
    }

    public static void main(String[] args) {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100); // return 1
        onlineStockSpan.next(80);  // return 1
        onlineStockSpan.next(60);  // return 1
        onlineStockSpan.next(70);  // return 2
        onlineStockSpan.next(60);  // return 1
        onlineStockSpan.next(75);
        onlineStockSpan.next(85);
    }
}
