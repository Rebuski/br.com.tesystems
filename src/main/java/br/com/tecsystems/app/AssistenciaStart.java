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
public class AssistenciaStart{
	

	
	public static void main(String[] args) {
		Conexao conn = new Conexao();
		conn.getEntity();
	}

}
