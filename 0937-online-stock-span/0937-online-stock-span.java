class StockSpanner {

    // Stack stores pairs of [price, span]
    Stack<int[]> s;

    public StockSpanner() {
        s = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Pop all prices less than or equal to current price
        while (!s.isEmpty() && s.peek()[0] <= price) {
            span += s.pop()[1];
        }

        // Push current price and its span
        s.push(new int[]{price, span});

        return span;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */