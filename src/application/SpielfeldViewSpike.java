package application;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class SpielfeldViewSpike extends GridPane implements SpielfeldView {
	
	private static final Color ANGEDEUTETEFARBESPIELER2 = Color.LIGHTCORAL;
	private static final Color ANGEDEUTETEFARBESPIELER1 = Color.LIGHTBLUE;
	private static final Color FARBESPIELER2 = Color.RED;
	private static final Color FARBESPIELER1 = Color.BLUE;
	private static final Color GRUNDFARBE = Color.DARKGRAY;

	public SpielfeldViewSpike(SpielfeldModel model) {
		super();
		this.setHgap(4);
		this.setVgap(4);
	
		JavaFXSpielfeldFeld feld = 
				new JavaFXSpielfeldFeld(model,         // Modell zum View
										0,             // Zeile
										0,             // Spalte
										30,            // Groesse
										GRUNDFARBE,    // Grundfarbe
										FARBESPIELER1,     // Farbe Spieler1
										FARBESPIELER2,     // Farbe Spieler2
										ANGEDEUTETEFARBESPIELER1, // Angedeutete Farbe Sp1
										ANGEDEUTETEFARBESPIELER2  // Angedeutete Farbe Sp2
										);
		getChildren().add(feld);
		GridPane.setColumnIndex(feld, 0);
		GridPane.setRowIndex(feld, 0);

		feld =  new JavaFXSpielfeldFeld(model,         // Modell zum View
										0,             // Zeile
										1,             // Spalte
										30,            // Groesse
										GRUNDFARBE,    // Grundfarbe
										FARBESPIELER1,     // Farbe Spieler1
										FARBESPIELER2,     // Farbe Spieler2
										ANGEDEUTETEFARBESPIELER1, // Angedeutete Farbe Sp1
										ANGEDEUTETEFARBESPIELER2  // Angedeutete Farbe Sp2
										);
		getChildren().add(feld);
		GridPane.setColumnIndex(feld, 1);
		GridPane.setRowIndex(feld, 0);
		model.addView(this);
	}

	@Override
	public void update() {
		for (Node child : getChildren()) {
			((JavaFXSpielfeldFeld)child).update();
		}

	}

}
