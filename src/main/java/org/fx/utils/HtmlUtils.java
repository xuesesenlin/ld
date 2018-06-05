package org.fx.utils;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class HtmlUtils {

    public String getHtml(String path) {
        return "file://" + getClass().getResource(path).getPath();
    }
}
