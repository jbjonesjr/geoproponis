package com.jbjonesjr;

import org.apache.log4j.Logger;
import org.odftoolkit.simple.PresentationDocument;
import org.odftoolkit.simple.draw.Textbox;
import org.odftoolkit.simple.presentation.Slide;

import java.io.InputStream;
import java.util.Iterator;


/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 5/29/14
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class OTPParser {

    private Logger logger = Logger.getLogger(OTPParser.class);

    private PresentationDocument pd;

    public Boolean prepare(String filename) {
        try {
            pd = PresentationDocument.loadDocument(filename);
        } catch (Exception e) {
            logger.error("Problem loading Document via file", e);
        }
        return null;
    }

    public Boolean prepare(InputStream is) {
        try {
            pd = PresentationDocument.loadDocument(is);
            is.close();
        } catch (Exception e) {
            logger.error("Problem loading Document via stream", e);
        }
        return null;
    }

    public int getSlideCount() {
        return pd.getSlideCount();
    }

    private Iterator<Slide> getSlides() {
        return pd.getSlides();
    }

    public Boolean hasMapSlide() {
        return pd.getSlideByName("Map") != null;
    }

    public Slide getMapSlide() {
        return pd.getSlideByName("Map");
    }

    public Boolean hasMapAndLegendSlide() {
        return pd.getSlideByName("MapAndLegend") != null;
    }

    public Slide getMapAndLegendSlide() {
        return pd.getSlideByName("MapAndLegend");
    }

    public Boolean hasMapAndFeaturesSlide() {
        return pd.getSlideByName("MapAndFeatures") != null;
    }

    public Slide getMapAndFeaturesSlide() {
        return pd.getSlideByName("MapAndFeatures");
    }

    public Boolean hasMapAndFeaturesAndLegendSlide() {
        return pd.getSlideByName("MapAndFeaturesAndLegend") != null || pd.getSlideByName("MapAndLegendAndFeatures") != null;
    }

    public Slide getMapAndFeaturesAndLegendSlide() {
        if(pd.getSlideByName("MapAndFeaturesAndLegend") != null){
           return pd.getSlideByName("MapAndFeaturesAndLegend");
        }else if(pd.getSlideByName("MapAndLegendAndFeatures") != null ){
            return pd.getSlideByName("MapAndLegendAndFeatures");
        }    else{
            return null;
        }
    }

    public Boolean hasFeaturesSlide() {
        return pd.getSlideByName("Features") != null;
    }

    public Slide getFeaturesSlide() {
        return pd.getSlideByName("Features") ;
    }

    public Boolean getMapElement(Slide s) {
        Iterator<Textbox> itr = s.getTextboxIterator();
        while (itr.hasNext()) {
            Textbox tb = itr.next();
            if (tb.getName().equalsIgnoreCase("Map") || tb.getTitle().equalsIgnoreCase("Map") || tb.getTextContent().equalsIgnoreCase("${MAP}$")) {
                logger.info(tb.getName());
            }
        }
        return null;
    }


}
