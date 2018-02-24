package views;

import controllers.Controller;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends gameloop.View
{
    public static double SCREEN_WIDTH = 300;
    public static double SCREEN_HEIGHT = 300;
    public static double GAME_WIDTH = 400;
    public static double GAME_HEIGHT = 400;

    public Controller controller;

    public Group root;
    public Scene scene;
    public Stage primaryStage;



    public View(Stage primaryStage)
    {
        controller = new Controller(this);

        createRoot();
        createScene();

        this.primaryStage = primaryStage;
    }



    @Override
    public void render()
    {

    }



    private void createRoot()
    {
        Pane map = new Pane();

        map.setMinSize(GAME_WIDTH,GAME_HEIGHT);
        root = new Group(map);
    }

    private void createScene()
    {
        scene = new Scene(root, View.SCREEN_WIDTH, View.SCREEN_HEIGHT, Color.BLACK);
    }
}