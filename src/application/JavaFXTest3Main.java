package application;
	

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class JavaFXTest3Main extends Application {
	

	private static JavaFXTest3Main instance=null;

	private SpielfeldModelSpike model = null;
	private BorderPane root = null;

	public JavaFXTest3Main() {
		super();
		instance=this;
		model = new SpielfeldModelSpike();
		try {
			root = (BorderPane)FXMLLoader.load(getClass().getResource("JavaFXTest3Main.fxml"));
			root.setPadding(new Insets(40, 40, 40, 40));
		} catch (IOException e) {
			e.printStackTrace();
		}
		SpielfeldViewSpike spielfeldViewSpike = new SpielfeldViewSpike(model);

		root.setCenter(spielfeldViewSpike);

	}
	
	public static JavaFXTest3Main getInstance() {
		return instance;
	}
	
	public SpielfeldModelSpike getModel(){
		return model;
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFXTest3 - Eigenes Control!");
	        	        
			Scene scene = new Scene(root,500,250);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
