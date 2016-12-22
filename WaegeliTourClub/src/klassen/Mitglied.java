package klassen;

import speicher.Speicher;

public class Mitglied extends Person {

	private double akloholProKM;
	private Waegeli zugehoerigesWaegeli;
	private Speicher speicher;
	
	public Mitglied(String username, String password, double alkoholProKM, Waegeli zugehoerigesWaegeli) {
		super(username, password);
		this.akloholProKM = alkoholProKM;
		this.zugehoerigesWaegeli = zugehoerigesWaegeli;
	}
	
	@Override
	public void anmelden() {
		// TODO Auto-generated method stub
		super.anmelden();
	}
	
	@Override
	public Person abmelden() {
		// TODO Auto-generated method stub
		return super.abmelden();
	}
	
	public void addWaegeli() {
		
	}
	
	public void deleteWaegeli() {
		
	}
	
	public void oeffneWaegeliVerwaltung() {
		
	}
	
	public void addTour(int km, String von, String bis) {
		
	}
}
