package pl.MyBank;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.MyBank.utils.FxmlUtils;

public class Main extends Application {

    public static final String MAIN_FXML = "/fxml/Main.fxml";

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primarystage) throws Exception {
        Pane borderPane = FxmlUtils.fxmlLoader(MAIN_FXML);
        Scene scene = new Scene(borderPane);
        primarystage.setScene(scene);
        primarystage.setTitle(FxmlUtils.getResourceBundle().getString("title.application"));
        primarystage.show();

    }
}
