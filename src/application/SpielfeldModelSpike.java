package application;

public class SpielfeldModelSpike implements SpielfeldModel {

	private SpielfeldFeldZustand zustandFeld1 = SpielfeldFeldZustand.LEER_UND_NICHT_BESETZBAR;
	private SpielfeldFeldZustand zustandFeld2 = SpielfeldFeldZustand.LEER_UND_NICHT_BESETZBAR;
	private SpielfeldView view=null;
	
	@Override
	public void besetzeFeld(int zeile, int spalte, int spielerNummer) {
		System.out.println("besetzeFeld("+ zeile+ ", "+ spalte+", "+ spielerNummer+")");
		if (spalte==0) {
			if (spielerNummer==1)
				zustandFeld1 = SpielfeldFeldZustand.BESETZT1;
			if (spielerNummer==2)
				zustandFeld1 = SpielfeldFeldZustand.BESETZT2;
		}
		else {
			if (spielerNummer==1)
				zustandFeld2 = SpielfeldFeldZustand.BESETZT1;
			if (spielerNummer==2)
				zustandFeld2 = SpielfeldFeldZustand.BESETZT2;
		}
		view.update();
	}

	@Override
	public SpielfeldFeldZustand getFeldZustand(int zeile, int spalte) {
		if (spalte==0)
			return zustandFeld1;
		return zustandFeld2;
	}
	
	public void setFeldZustand(int zeile, int spalte, SpielfeldFeldZustand zustand){
		if (spalte==0)
			this.zustandFeld1 = zustand;
		else
			this.zustandFeld2 = zustand;
		view.update();
	}
	
	public void addView(SpielfeldView view){
		this.view = view;
	}

}
