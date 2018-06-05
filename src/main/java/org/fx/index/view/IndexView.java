package org.fx.index.view;

import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.fx.utils.HtmlUtils;

import static javafx.stage.StageStyle.TRANSPARENT;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class IndexView {

    public void index(Stage primaryStage) throws Exception {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();
//        加载静态页面
        webEngine.load(new HtmlUtils().getHtml("/index/html/index.html"));
//        加载js文件
//        webEngine.executeScript(new HtmlUtils().getHtml("/public/js/jquery-3.3.1.min.js"));
        //设置窗口的图标.
//        primaryStage.getIcons().add(new Image(getClass().getResource("/image/ico.jpg").toExternalForm()));
//        禁止窗口缩放
        primaryStage.setResizable(false);
//        设置窗口风格
//        1) DECORATED——白色背景，带有最小化/最大化/关闭等有操作系统平台装饰（ 默认设置）
//        2) UNDECORATED——白色背景，没有操作系统平台装饰
//        3) TRANSPARENT——透明背景，没有操作系统平台装饰
//        4) UTILITY——白色背景，只有关闭操作系统平台装饰
//        5) UNIFIED——有操作系统平台装饰，消除装饰和内容之间的边框，内容背景和边框背景一致，（但要视平台支持），可以通过javafx.application.Platform.isSupported(javafx.application.ConditionalFeature)判断
        primaryStage.initStyle(TRANSPARENT);
//        最小化，任务栏可见图标
//        primaryStage.setIconified(true);
//        始终显示在其他窗口之上
//        stage.setAlwaysOnTop(true);
//        设置操作系统修饰的title
//        primaryStage.setTitle("后台管理");
        Scene scene = new Scene(webView);
//        scene.getStylesheets().add(getClass().getResource("/static/bootstrap-4.0.0-dist/css/bootstrap.min.css").toExternalForm());
        primaryStage.setScene(scene);
//        显示
        primaryStage.show();
    }
}
