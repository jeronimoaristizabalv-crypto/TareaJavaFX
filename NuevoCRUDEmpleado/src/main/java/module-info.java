module co.edu.uniquindio.poo.empresajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.poo.nuevocrudempleado to javafx.fxml;
    exports co.edu.uniquindio.poo.nuevocrudempleado;
    exports co.edu.uniquindio.poo.nuevocrudempleado.viewController;
    opens co.edu.uniquindio.poo.nuevocrudempleado.viewController to javafx.fxml;

}

