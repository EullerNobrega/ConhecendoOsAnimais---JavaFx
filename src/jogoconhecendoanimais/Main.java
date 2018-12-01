package jogoconhecendoanimais;

import Telas.TelaInicio;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Euller
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            TelaInicio inicio = new TelaInicio();
            primaryStage = inicio.getMainStage();
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
