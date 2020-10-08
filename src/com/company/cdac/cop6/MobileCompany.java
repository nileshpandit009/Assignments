package com.company.cdac.cop6;

public class MobileCompany {

    public enum Plan {
        A, B, C
    }

    public double monthlyBill(int totalCalls, Plan plan) {
        double monthlyRental;

        switch (plan) {
            case A:
                monthlyRental = 100;
                if (totalCalls < 100) {
                    return monthlyRental;
                } else {
                    return monthlyRental + this.getCharges(totalCalls, 0.75, 1.0, 1.25);
                }

            case B:
                monthlyRental = 150;
                if (totalCalls < 100) {
                    return monthlyRental;
                } else {
                    return monthlyRental + this.getCharges(totalCalls, 0.50, 0.75, 1.00);
                }

            case C:
                monthlyRental = 200;
                if (totalCalls < 100) {
                    return monthlyRental;
                } else {
                    return monthlyRental + this.getCharges(totalCalls, 0.25, 0.50, 0.75);
                }
        }

        return -1;
    }

    private double getCharges(int totalCalls, double charge1, double charge2, double charge3) {
        double callCharges;
        if (totalCalls <= 200) {
            callCharges = charge1 * (totalCalls - 100);
        } else if (totalCalls <= 300) {
            callCharges = (charge1 * 100) + (charge2 * (totalCalls - 200));
        } else {
            callCharges = (charge1 * 100) + (charge2 * 100) + (charge3 * (totalCalls - 300));
        }
        return callCharges;
    }
}
