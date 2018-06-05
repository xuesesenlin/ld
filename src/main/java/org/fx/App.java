package org.fx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.fx.index.view.IndexView;

/**
 * 程序入口
 */
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        打开主页面
        new IndexView().index(primaryStage);
    }
}
