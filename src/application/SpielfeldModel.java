package application;

public interface SpielfeldModel {
	public void besetzeFeld(int zeile, int spalte, int spielerNummer);

	public SpielfeldFeldZustand getFeldZustand(int zeile, int spalte);
	
	public void addView(SpielfeldView view);
}
