package gameloop;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    public GameLoop gameLoop = new GameLoop(this);

    @FXML
    public Button button;

    @FXML
    public void go()//after userinput
    {
        GameLoop.logicUpdate = true;
    }

    @FXML
    public void initialize() {
        gameLoop.start();
    }

    public void render()
    {
        System.out.println("hey listen");
        button.setText("eyboy");
    }
}
