package be.jidoka.clean.code.labs.movie;

import java.time.DayOfWeek;

public class MovieBill implements Bill {

    double billTotal;
    int numberOfTickets;

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    @Override
    public void startPurchase(int runtime, DayOfWeek dayOfWeek, boolean loge, boolean threeD) {
        billTotal = 0;
    }

    @Override
    public void addTicket(int age, boolean student) {
        if (student) {
            billTotal += 8.00;
        } else {
            if (age >= 65) {
                billTotal += 6.00;
            } else if (age < 13) {
                billTotal += 5.50;
            } else {
                billTotal += 11.00;
            }
        }
        numberOfTickets += 1;
    }


    @Override
    public double finishPurchase() {
        return billTotal;
    }
}
