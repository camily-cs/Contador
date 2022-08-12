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
	
	//variavel contador
	private int contador = 0;
	
	//metodo para estilizacao condicional do label (altera a cor do label em numeros negativos ou positivos)
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		//removendo cores
		label.getStyleClass().remove("corVerde");
		label.getStyleClass().remove("corVermelha");
		
		//estilizacao condicional
		if(contador > 0) {
			label.getStyleClass().add("corVerde");
		} else if(contador < 0) {
			label.getStyleClass().add("corVermelha");
		}
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		//label
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		//btn decremento  
		Button botaoDecremento = new Button("-");
		//css btn decremento
		botaoDecremento.getStyleClass().add("btn");
		//adicionando funcionalidade ao btn decremento
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		
		//btn incremento
		Button botaoIncremento = new Button("+");
		//css btn incremento
		botaoIncremento.getStyleClass().add("btn");
		//adicionando funcionalidade ao btn incremento
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		
		
		//HBox "boxBotoes" para armazenar botoes  
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);	//centralizando
		boxBotoes.setSpacing(10); //definindo espacamento entre btns
		//Armazenando botoes na "boxBotoes"
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		
		//VBox "boxContainer" 
		VBox boxContainer = new VBox();
		boxContainer.getStyleClass().add("container"); //
		boxContainer.setAlignment(Pos.CENTER); // centralizando
		boxBotoes.setSpacing(10); //espacamento
		//Armazenando labels e a "boxBotoes" na "boxContainer"
		boxContainer.getChildren().add(labelTitulo);
		boxContainer.getChildren().add(labelNumero);
		boxContainer.getChildren().add(boxBotoes);
		
		
		//Importando Css
		String caminhoCss = getClass().getResource("/contador/Style.css").toExternalForm();
		
		//Criando cena
		Scene cenaPrincipal = new Scene(boxContainer, 400, 400);
		
		//adicionando Css
		cenaPrincipal.getStylesheets().add(caminhoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Roboto"); //fonte
		
		//inserindo cena no palco
		primaryStage.setScene(cenaPrincipal);
		
		//executando
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


