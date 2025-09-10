import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();

		DateTimeFormatter format01 = DateTimeFormatter.ofPattern("HH:mm dd/MM/yy").withZone(ZoneId.systemDefault());
		
		System.out.println(format01.format(d3));
	}
}
