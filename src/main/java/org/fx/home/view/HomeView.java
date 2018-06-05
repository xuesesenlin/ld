package org.fx.home.view;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class HomeView {

    public void index() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/home/fxml/index.fxml"));
        Scene scene = new Scene(root);
        ObservableList<Stage> stages = FXRobotHelper.getStages();
        stages.get(0).setScene(scene);
    }
}
