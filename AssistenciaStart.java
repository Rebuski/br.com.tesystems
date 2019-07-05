/**
 * 
 */
package br.com.tecsystems.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import br.com.tecsystems.jpa.Conexao;

/**
 * @author Adler
 *
 */
public class AssistenciaStart extends Application{
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LogManager.getLogger(AssistenciaStart.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("unused")
		//final Logger LOG = LogManager.getLogger(AssistenciaStart.class);
		
		//Conexao con =  new Conexao();
		//con.getEntity();
		//launch(args);
	}

	public void start(Stage args) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("../view/ui_main.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/css/estilo.css").toExternalForm());
		args.setTitle("Login");
		args.setScene(scene);
		args.show();
	}
	
	public static void maind(String[] args) {
		Conexao conn = new Conexao();
		conn.getEntity();
	}

}
