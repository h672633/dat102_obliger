package no.hvl.data102;

import java.util.ArrayList;

import no.hvl.data102.adt.*;

public class Filmarkiv implements FilmarkivADT {
	
	
	private Film[] arkiv;
	int nesteLedig;
	
	
	public Filmarkiv() {
		
	}
	
	public Filmarkiv(int n) {
		arkiv = new Film[n];
		nesteLedig = 0;
		
		
	}
	
	

	@Override
	public Film finnFilm(int nr) {
		
		for (int i = 0; i<arkiv.length;i++) {
			if (arkiv[i].getFilmnr() == nr) {
				
				return arkiv[i];
			}
		}
		
		
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (nesteLedig == arkiv.length) {
			utvid();
		}
		arkiv[nesteLedig] = nyFilm;
		nesteLedig++;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		int index = -1;
		
		for (int i = 0; i < arkiv.length;i++) {
			if (arkiv[i].getFilmnr() == filmnr){
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			return false;
		}
		Film [] nyArkiv = new Film [arkiv.length -1];
		
		System.arraycopy(arkiv, 0, nyArkiv, 0, index);
		System.arraycopy(arkiv, index + 1, nyArkiv, index, arkiv.length - index - 1);
		arkiv = nyArkiv;
		return true;
		
		
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		ArrayList<Film> result = new ArrayList<>();
		
		for (Film film: arkiv) {
			if (film.getTittel().contains(delstreng)) {
				result.add(film);
			}
		}
		
		
		return result.toArray(new Film[result.size()]);
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
          ArrayList<Film> result = new ArrayList<>();
		
		for (Film film: arkiv) {
			if (film.getFilmskaper().contains(delstreng)) {
				result.add(film);
			}
		}
		
		
		return result.toArray(new Film[result.size()]);
	}

	@Override
	public int antall(Sjanger sjanger) {
		int antallfilmer = 0;
		
		for (int i = 0; i<nesteLedig; i++) {
			if (arkiv[i].getSjanger() == sjanger) {
				antallfilmer++;
			}
		}
		
		
		
		return antallfilmer;
	}

	@Override
	public int antall() {
		return nesteLedig;
	}
	
	private void utvid() {
		
		Film [] utvidetArkiv = new Film[arkiv.length*2];
		
		for (int i = 0; i<utvidetArkiv.length; i++) {
			utvidetArkiv[i] = arkiv[i];
		}
		
		arkiv = utvidetArkiv;
		
	}
	
	

}
