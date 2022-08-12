package contador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	public void start(Stage primaryStage) throws Exception {
		
		//Criando label e btns
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");	
		Button botaoDecremento = new Button("-");
		Button botaoIncremento = new Button("+");
		
		
		//Criando HBox "boxBotoes" para armazenar botoes, centralizando e definindo espacamento
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);	
		boxBotoes.setSpacing(10);
		//Armazenando botoes na "boxBotoes"
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		
		//Criando VBox "boxPrincipal", centralizando e definindo espacamento
		VBox boxPrincipal = new VBox();
		boxPrincipal.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		//Armazenando labels e a "boxBotoes" na "boxPrincipal"
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		
		//Criando e inserindo cena no palco
		Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);
		primaryStage.setScene(cenaPrincipal);
		
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


