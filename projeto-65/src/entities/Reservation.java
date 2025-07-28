package entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import exceptions.DomainException;

public class Reservation {
	private Integer room;
	private LocalDate checkin;
	private LocalDate checkout;

	public Reservation() {
	}

	public Reservation(Integer room, LocalDate checkin, LocalDate checkout) {
		if (checkin.isAfter(checkout)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		this.room = room;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public Integer duration() {
		Duration duration = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());

		return (int) duration.toDays();
	}

	public void updateDates(LocalDate checkin, LocalDate checkout) {
		if (checkin.isAfter(checkout)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
			
		} else if (checkin.isBefore(this.checkout) || checkout.isBefore(this.checkout)) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
		} 
		
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		StringBuilder text = new StringBuilder();

		text.append("Reservation: ");
		text.append("Room " + room + ", ");
		text.append("check-in: " + checkin.format(dateTimeFormatter) + ", ");
		text.append("check-out: " + checkout.format(dateTimeFormatter) + ", ");
		text.append(duration() + " nights");

		return text.toString();
	}
}
