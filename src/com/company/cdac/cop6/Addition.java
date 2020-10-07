package com.company.cdac.cop6;

public class Addition {

    private int sum;

    public int byBitwiseOperations(int a, int b) {
        while (b != 0) {
            int carry = (a & b);
            a = (a ^ b);
            b = carry << 1;
        }
        return a;
    }

    public int byDecrementOperator(int a, int b) {
        while (b-- != 0) {
            ++a;
        }
        return a;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public int byForLoop(int a, int b) {
        int i;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (i = min; max > 0; i++, --max);
        return i;
    }

    public int byRecursion(int a, int b) {
        if (b == 0) return a;
        else return byRecursion((a ^ b), ((a & b) << 1));
    }

    public void byClassMember(int a, int b) {
        this.setSum(a + b);
    }

    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
