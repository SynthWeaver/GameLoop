import gameloop.GameLoop;
import gameloop.View;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class Controller extends gameloop.Controller{

    public Controller(View view) {
        this.view = view;
    }

    View view;

    @Override
    public void render()
    {
        view.render();
    }

    @Override
    public void tick()
    {

    }
}
