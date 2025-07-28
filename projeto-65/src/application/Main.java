package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import entities.Reservation;
import exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {

			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			sc.nextLine();

			LocalDate checkin, checkout;

			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), dateTimeFormatter);

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), dateTimeFormatter);

			Reservation reservation = new Reservation(roomNumber, checkin, checkout);

			System.out.println(reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");

			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), dateTimeFormatter);

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), dateTimeFormatter);

			reservation.updateDates(checkin, checkout);
			System.out.println(reservation);
			
		} catch (DateTimeParseException e) {
			System.out.println("Invalid date format!");
			
		} catch (DomainException e) {
			System.out.println("Invalid dates: " + e.getMessage());
		} finally {
			sc.close();
		}

	}
}
