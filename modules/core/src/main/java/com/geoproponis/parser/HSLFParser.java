package com.geoproponis.parser;


import org.odftoolkit.simple.presentation.Slide;

/**
 * HSLF is the apache poi name for Powerpoint 97-2007 formats ('97, 2007)
 */
public class HSLFParser implements Parser{

    public int getSlideCount() {
        return 0;
    }

    public Boolean hasMapSlide() {
        return null;
    }

    public Slide getMapSlide() {
        return null;
    }

    public Boolean hasMapAndLegendSlide() {
        return null;
    }

    public Slide getMapAndLegendSlide() {
        return null;
    }

    public Boolean hasMapAndFeaturesSlide() {
        return null;
    }

    public Slide getMapAndFeaturesSlide() {
        return null;
    }

    public Boolean hasMapAndFeaturesAndLegendSlide() {
        return null;
    }

    public Slide getMapAndFeaturesAndLegendSlide() {
        return null;
    }

    public Boolean hasFeaturesSlide() {
        return null;
    }

    public Slide getFeaturesSlide() {
        return null;
    }

    public Boolean getMapElement(Slide s) {
        return null;
    }
}
