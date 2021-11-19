package di_t4_55124290y;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class VistaPrincipalController implements Initializable {

    @FXML
    private AnchorPane Panel;

    @FXML
    private void aplicarEstilo1(ActionEvent event) {
        Panel.getStylesheets().clear();
        Panel.getStylesheets().add("/estilos/estilo1.css");
    }

    @FXML
    private void aplicarEstilo2(ActionEvent event) {
        Panel.getStylesheets().clear();
        Panel.getStylesheets().add("/estilos/estilo2.css");
    }

    @FXML
    private void aplicarEstilo3(ActionEvent event) {
        Panel.getStylesheets().clear();
        Panel.getStylesheets().add("/estilos/estilo3.css");
    }

    @FXML
    private void resetear(ActionEvent event) {
        Panel.getStylesheets().clear();
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
