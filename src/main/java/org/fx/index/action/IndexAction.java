package org.fx.index.action;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.fx.account.model.AccountModel;
import org.fx.account.service.AccountService;
import org.fx.account.service.impl.AccountServiceImpl;
import org.fx.home.view.HomeView;
import org.fx.utils.AlertUtil;
import org.fx.utils.ResponseResult;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class IndexAction {

    double x1;
    double y1;

    @FXML
    private TextField login_account_textField;
    @FXML
    private PasswordField login_password_passwordField;
    @FXML
    private Label login_error_label;

    private AccountService accountService = new AccountServiceImpl();

    //    忘记密码
    @FXML
    private void forgetThePassword(ActionEvent event) {
        new AlertUtil().f_alert_confirmDialog("警告", "维护中");
    }

    //注册
    @FXML
    private void register(ActionEvent event) {
        new AlertUtil().f_alert_confirmDialog("警告", "维护中");
    }

    //    重置
    @FXML
    private void reset(ActionEvent event) {
        login_account_textField.setText(null);
        login_password_passwordField.setText(null);
        login_error_label.setText(null);
    }

    //    登录
    @FXML
    private void login(ActionEvent event) {
        login_error_label.setText(null);
        String account = login_account_textField.getText();
        String password = login_password_passwordField.getText();
        if (account == null || account.trim().equals(""))
            login_error_label.setText("账户或密码错误");
        else if (password == null || password.trim().equals(""))
            login_error_label.setText("账户或密码错误");
        else {
            Task<Void> task = new Task<Void>() {
                @Override
                protected Void call() throws Exception {
                    Platform.runLater(() -> {
                        try {
                            AccountModel model = new AccountModel();
                            model.setAccount(account);
                            model.setPassword(password);
                            ResponseResult<AccountModel> result = accountService.findByModel(model);
                            if (result.isSuccess()) {
                                try {
                                    new HomeView().index();
                                } catch (Exception e) {
                                    login_error_label.setText("跳转失败");
                                }
                            } else
                                login_error_label.setText(result.getMessage());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                    return null;
                }
            };
            new Thread(task).start();
        }
    }

    //    关闭
    @FXML
    private void close(MouseEvent event) {
        AlertUtil util = new AlertUtil();
        boolean b = util.f_alert_confirmDialog("警告", "是否确定退出");
        if (b) {
            //        获取stage
            ObservableList<Stage> stages = FXRobotHelper.getStages();
            stages.get(0).close();
        }
    }

    //拖动窗口
    @FXML
    private void dragged(MouseEvent m) {
        //获取当前窗口的坐标
        ObservableList<Stage> stages = FXRobotHelper.getStages();
        Stage stage = stages.get(0);
        double x_stage = stage.getX();
        double y_stage = stage.getY();
        //计算
        stage.setX(x_stage + m.getX() - x1);
        stage.setY(y_stage + m.getY() - y1);
    }

    //拖动窗口
    @FXML
    private void pressed(MouseEvent m) {
        //按下鼠标后，记录当前鼠标的坐标
        x1 = m.getX();
        y1 = m.getY();
    }
}
