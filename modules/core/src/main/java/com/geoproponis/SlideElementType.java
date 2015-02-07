package com.geoproponis;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 11/14/14
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */
public enum SlideElementType {
    MAP(),
    LEGEND(),
    FEATURE(),
    FEATURES(),
    SELECTEDFEATURE(),
    SELECTEDFEATURES();

    private String name;
    private String title;
    private String content;
}
