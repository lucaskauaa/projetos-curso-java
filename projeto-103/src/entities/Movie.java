package entities;

import java.util.Objects;

public class Movie {

	private String title;
	private String genre;
	private Double note;

	public Movie(String title, String genre, Double note) {
		this.title = title;
		this.genre = genre;
		this.note = note;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre, note, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(genre, other.genre) && Objects.equals(note, other.note)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		StringBuilder text = new StringBuilder();

		text.append("\nNome: " + title + "\n");
		text.append("Gênero: " + genre + "\n");
		text.append("Nota: " + String.format("%.1f", note));

		return text.toString();
	}

}
