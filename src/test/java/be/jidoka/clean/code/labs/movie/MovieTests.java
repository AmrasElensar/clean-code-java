package be.jidoka.clean.code.labs.movie;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class MovieTests {


    @Test
    void TotalBillIsZeroWhenStartingAPurchase() {
        Bill bill = new MovieBill();
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        assertThat(bill.finishPurchase()).isEqualTo(0.0);
    }


}
