package be.jidoka.clean.code.labs.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.assertj.core.api.Assertions.assertThat;

public class MovieTests {

    Bill bill;

    @BeforeEach
    void init() {
        bill = new MovieBill();
    }


    @Test
    @DisplayName("When starting a purchase the total bill should be zero")
    void StartAPurchase() {
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        assertThat(bill.finishPurchase()).isEqualTo(0.0);
    }

    @Test
    @DisplayName("When adding a general admission Ticket, the total bill value should be '11,00'.")
    void AddGeneralAdmissionTicket() {
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        bill.addTicket(18, false);
        assertThat(bill.finishPurchase()).isEqualTo(11.00);
    }

    @Test
    @DisplayName("When adding 2 general admission tickets, the total bill value should be '22.00'.")
    void AddMultipleGeneralAdmissionTickets() {
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        bill.addTicket(18, false);
        bill.addTicket(18, false);

        assertThat(bill.finishPurchase()).isEqualTo(22.00);
    }

    @Test
    @DisplayName("When adding a student ticket, the total bill value should be '8.00'.")
    void AddStudentTicket(){
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        bill.addTicket(19, true);

        assertThat(bill.finishPurchase()).isEqualTo(8.00);
    }

    @Test
    @DisplayName("When adding a senior citizen project, the total bill value should be '6.00'.")
    void AddSeniorCitizenTicket(){
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        bill.addTicket(66, false);

        assertThat(bill.finishPurchase()).isEqualTo(6.00);
    }

    @Test
    @DisplayName("When adding a children's ticket, the total bill value should be '5.50'. ")
    void AddChildrensTicket(){
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        bill.addTicket(11, false);

        assertThat(bill.finishPurchase()).isEqualTo(5.50);
    }

    @Test
    @DisplayName("When adding a ticket, the number of tickets is increased by 1")
    void AddATicket(){
        bill.startPurchase(90, DayOfWeek.MONDAY, false, false);
        bill.addTicket(11, false);

       // assertThat()
    }
}
