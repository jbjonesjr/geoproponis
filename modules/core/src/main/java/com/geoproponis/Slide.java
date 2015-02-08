package com.geoproponis;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 11/14/14
 * Time: 11:22 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Slide {

    public Object getSlide();
    public SlideType getSlideType() ;
    public boolean addElement(SlideElement se);


    public SlideElement getElement(SlideElementType set);
}
