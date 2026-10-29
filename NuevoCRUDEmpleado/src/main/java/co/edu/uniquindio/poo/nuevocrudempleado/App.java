package co.edu.uniquindio.poo.nuevocrudempleado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import co.edu.uniquindio.poo.nuevocrudempleado.model.Empleado;
import co.edu.uniquindio.poo.nuevocrudempleado.model.Empresa;
import co.edu.uniquindio.poo.nuevocrudempleado.viewController.EmpleadoViewController;
import co.edu.uniquindio.poo.nuevocrudempleado.viewController.PrimaryController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    public static Empresa empresa = new Empresa("UQ");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Gestion de Empleados");
        openViewPrincipal();
    }

    private void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("primary.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            PrimaryController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void openCrudEmpleado() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudEmpleado.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            EmpleadoViewController empleadoViewController = loader.getController();
            empleadoViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //servicios

    public void inicializarData(){
        Empleado empleado = new Empleado("12233", "juan", "apellido");
        empresa.agregarEmpleado(empleado);
    }
}