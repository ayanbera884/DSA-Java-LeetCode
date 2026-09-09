# 121. Best Time to Buy and Sell Stock

## Approach

Keep track of:

- Minimum stock price seen so far.
- Maximum profit possible.

For every price:

1. Update the minimum price if the current price is smaller.
2. Calculate the profit by selling at the current price.
3. Update the maximum profit.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Key Concept

Maximum Profit = Current Price - Minimum Price So Far