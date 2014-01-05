package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class JavaFXTest3Controller {
	
	@FXML
    // fx:id="FXIDCB1"
    private ComboBox<String> FXIDCB1; // Value injected by FXMLLoader	

	@FXML
    // fx:id="FXIDCB2"
    private ComboBox<String> FXIDCB2; // Value injected by FXMLLoader	

	private SpielfeldFeldZustand uebersetzeStringInZustand(String zustand) {
		SpielfeldFeldZustand neuerZustand = null;
		if (zustand.equals("LEER_UND_NICHT_BESETZBAR"))
			neuerZustand = SpielfeldFeldZustand.LEER_UND_NICHT_BESETZBAR;
		else if (zustand.equals("LEER_UND_BESETZBAR2"))
			neuerZustand = SpielfeldFeldZustand.LEER_UND_BESETZBAR2;
		else if (zustand.equals("LEER_UND_BESETZBAR1"))
			neuerZustand = SpielfeldFeldZustand.LEER_UND_BESETZBAR1;
		else if (zustand.equals("BESETZT2"))
			neuerZustand = SpielfeldFeldZustand.BESETZT2;
		else 
			neuerZustand = SpielfeldFeldZustand.BESETZT1;
		return neuerZustand;
	}

	
	@FXML protected void setzeZustand1(ActionEvent event) {
		System.out.println("Box 1:" + FXIDCB1.getValue());
		SpielfeldFeldZustand neuerZustand = uebersetzeStringInZustand(FXIDCB1.getValue());
		JavaFXTest3Main.getInstance().getModel().setFeldZustand(0,0, neuerZustand);
	}


	@FXML protected void setzeZustand2(ActionEvent event) {
		System.out.println("Box 2:" + FXIDCB2.getValue());
		SpielfeldFeldZustand neuerZustand = uebersetzeStringInZustand(FXIDCB2.getValue());
		JavaFXTest3Main.getInstance().getModel().setFeldZustand(0,1, neuerZustand);
	}
	
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    }

}
