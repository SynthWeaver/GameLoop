import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends gameloop.View
{
    public static double SCREEN_WIDTH = 300;
    public static double SCREEN_HEIGHT = 300;

    public View(Stage primaryStage)
    {
        root = makeRoot();
        scene = new Scene(root, View.SCREEN_WIDTH, View.SCREEN_HEIGHT, Color.BLACK);
        this.primaryStage = primaryStage;
    }

    public Group root;
    public Scene scene;
    public Stage primaryStage;



    @Override
    public void tick()
    {

    }

    @Override
    public void render()
    {
        root = makeRoot();
        scene.setRoot(root);
    }

    private Group makeRoot()
    {
        return new Group();
    }
}