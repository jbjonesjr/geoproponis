package com.geoproponis;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 2/8/15
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class SlideElement {

    private SlideElementType type;

    private double width;
    private double height;

    private double x;
    private double y;

    private String cssBorder;

    public SlideElement(SlideElementType type) {
        this.type = type;
    }

    public SlideElement(SlideElementType type, double width, double height, double x, double y) {
        this.type = type;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public SlideElementType getType() {
        return type;
    }
}
