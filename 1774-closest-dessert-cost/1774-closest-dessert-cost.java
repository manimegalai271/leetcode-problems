class Solution {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {

        int closest = Integer.MAX_VALUE;

        for (int base : baseCosts) {
            // ✅ store the result
            closest = find(toppingCosts, 0, base, target, closest);
        }

        return closest;
    }

    public int find(int[] topping, int i, int cost, int target, int closest) {

        if (Math.abs(cost - target) < Math.abs(closest - target) ||
           (Math.abs(cost - target) == Math.abs(closest - target) && cost < closest)) {
            closest = cost;
        }

        if (i == topping.length) return closest;

        closest = find(topping, i + 1, cost, target, closest);
        closest = find(topping, i + 1, cost + topping[i], target, closest);
        closest = find(topping, i + 1, cost + 2 * topping[i], target, closest);

        return closest;
    }
}