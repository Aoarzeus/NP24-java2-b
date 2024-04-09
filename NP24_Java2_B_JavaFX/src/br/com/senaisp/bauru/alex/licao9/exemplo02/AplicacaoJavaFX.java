package br.com.senaisp.bauru.alex.licao9.exemplo02;

import java.awt.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AplicacaoJavaFX extends Application {

	@Override
	public void start(Stage primeirasStage) throws Exception {
		// criar o nó raiz ou container principal
		Group root = new Group();
		// Criar um componentes de tela
		criarComponentes(root);
		// criando a cena e configuração de janela
		Scene scena = new Scene(root, 600, 400, javafx.scene.paint.Color.WHITE);
		primeirasStage.setTitle("Java FX");
		primeirasStage.setScene(scena);
		primeirasStage.show();

	}

	private void criarComponentes(Group root) {
		HBox hbox = new HBox();
		//criando os botoes
		Button btn01 =  new Button("Olá mundo!");
		Button btn02 = new Button("222");
	    Button btn03 = new Button("33333");
	    //ajustando  os botoes 
	    HBox.setHgrow(btn01, Priority.ALWAYS);
	    HBox.setHgrow(btn02, Priority.ALWAYS);
	    HBox.setHgrow(btn03, Priority.ALWAYS);
	    //indicando o maximo que pode ser aumentar 
	    btn01.setMaxWidth(Double.MAX_VALUE);
	    btn02.setMaxWidth(Double.MAX_VALUE);
	    btn03.setMaxWidth(Double.MAX_VALUE);
	    //adicionando botoes no hbox
	    hbox.getChildren().addAll(btn01, btn02, btn03);
	   //dimensionando o hbox
	    hbox.setPrefWidth(600);
	    //posicionando os potoes no hbox
	    root.getChildren().addAll(hbox);
	    hbox.setLayoutX(300);
	    //criando o retangulo 
	    Rectangle rec = new Rectangle(150, 150, javafx.scene.paint.Color.DARKBLUE);
	    rec.setLayoutX(50);
	    rec.setLayoutY(50);
	    //colocando o contorno 
	    rec.setStroke(javafx.scene.paint.Color.ORANGE);
	    rec.setStrokeWidth(15);
	    //adicionar o rectangle ao nó root 
	    root.getChildren().add(rec);
	    //Adicionando o texto 
	    Text txt = new Text("Dorm 6:\n200");
	    txt.setFont(Font.font("Verdana",FontWeight.BOLD, 30));
	    txt.setFill(javafx.scene.paint.Color.RED);
	    txt.setLayoutX(250);
	    txt.setLayoutY(100);
	    //adicioinando ao nó  root 
	    root.getChildren().add(txt);
	}

	public static void main(String[] args) {
		launch(args);

	}

}
