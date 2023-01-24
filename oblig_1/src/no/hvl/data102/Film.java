package no.hvl.data102;

import java.util.Objects;

public class Film {
	
	private int filmnr;
	private String filmskaper;
	private String tittel;
	private int lansering;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, int lansering, Sjanger sjanger, String filmselskap) {
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.lansering = lansering;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
		
		
	}
	
	
	public int getFilmnr() {
		return filmnr;
		
	}
	
	public void setFilm(int filmnr) {
		this.filmnr = filmnr;
	}
	
	public String getFilmskaper() {
		return filmskaper;
	}
	
	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}
	
	public String getTittel()  {
		return tittel;
	}
	
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	
	public int getLansering() {
		return lansering;
		
	}
	
	public void setLansering(int lansering) {
		this.lansering = lansering;
		
	}
	
	public Sjanger getSjanger() {
		return sjanger;
		
	}
	
	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
		
	}
	
	public String getFilmselskap() {
		return filmselskap;
	}
	
	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return this.filmnr == other.getFilmnr();
	}
	

}
