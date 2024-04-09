package br.com.senaisp.bauru.alex.licao9.exemplo01;

import java.awt.Button;
import java.util.Stack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CriacaoBotoes extends Application {

	@Override
	public void start(Stage primeiraStage) throws Exception {
		javafx.scene.control.Button btn01 = new javafx.scene.control.Button();
		javafx.scene.control.Button btn02 = new javafx.scene.control.Button();

		btn01.setText("Olá mundo!");
		btn01.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Olá mundo clicado!");

			}
		});
		// criando a cena
		Group root = new Group();
		// Criando cena com 800x 600
		Scene scena = new Scene(root, 800, 600);
		// Adicionando os componentes ao nó root
		root.getChildren().add(btn01);
		root.getChildren().add(btn02);
		//posicionando no eixo Y 100 pixels
		btn01.setLayoutY(100);

		// finalizando a configurança da janela
		primeiraStage.setScene(scena);
		primeiraStage.setTitle("Titulo da janela");
		// Mostrando a janela
		primeiraStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
