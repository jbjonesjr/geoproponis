package com.geoproponis;

import org.odftoolkit.simple.presentation.Slide;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 10/13/14
 * Time: 6:12 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Parser {
    int getSlideCount();

    Boolean hasMapSlide();

    Slide getMapSlide();

    Boolean hasMapAndLegendSlide();

    Slide getMapAndLegendSlide();

    Boolean hasMapAndFeaturesSlide();

    Slide getMapAndFeaturesSlide();

    Boolean hasMapAndFeaturesAndLegendSlide();

    Slide getMapAndFeaturesAndLegendSlide();

    Boolean hasFeaturesSlide();

    Slide getFeaturesSlide();

    Boolean getMapElement(Slide s);
}
