package com.geoproponis.parser;

import com.geoproponis.*;
import com.geoproponis.slide.OOSlide;
import org.apache.log4j.Logger;
import org.odftoolkit.simple.PresentationDocument;
import org.odftoolkit.simple.draw.Textbox;
import org.odftoolkit.simple.presentation.Slide;
import org.springframework.stereotype.Component;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.InputStream;
import java.util.*;


@Component
public class OTPParser implements Parser {

    private Logger logger = Logger.getLogger(OTPParser.class);

    private List<PresentationFormat> validPresentationFormats = new ArrayList<PresentationFormat>();
    private PresentationDocument pd;

    public OTPParser(){
        validPresentationFormats.add(PresentationFormat.ODTP);
    }

    public List<PresentationFormat> validPresentationFormats() {
        return validPresentationFormats;
    }

    public Map<SlideType, com.geoproponis.Slide> process(String filename) throws Exception{
        try {
            this.pd = PresentationDocument.loadDocument(filename);
            return processPresentationDocument(this.pd);


        } catch (Exception e) {
            logger.error("Problem loading Document via filename", e);
        }
        return null;
    }

    public Map<SlideType, com.geoproponis.Slide> process(File file) {
        try {
            this.pd = PresentationDocument.loadDocument(file);
            return processPresentationDocument(this.pd);
        } catch (Exception e) {
            logger.error("Problem loading Document via file", e);
        }
        return null;
    }

    public Map<SlideType, com.geoproponis.Slide> process(InputStream is) {
        try {
            this.pd = PresentationDocument.loadDocument(is);
            is.close();
            return processPresentationDocument(this.pd);
        } catch (Exception e) {
            logger.error("Problem loading Document via stream", e);
        }
        return null;
    }

    public int getNativeSlideCount() {
        return pd.getSlideCount();
    }


    private SlideType getSlideType(Slide s) {
        SlideType st = getSlideTypeByTitle(s);
        if (st != null)
            return st;
        else
            return getSlideTypeByElements(s);
    }

    private Map<SlideType, com.geoproponis.Slide> processPresentationDocument(PresentationDocument pd) {
        Map<SlideType, com.geoproponis.Slide> return_slides = new HashMap<SlideType, com.geoproponis.Slide>();
        Iterator<Slide> itr = pd.getSlides();
        while (itr.hasNext()) {
            Slide s = itr.next();
            SlideType st = this.getSlideType(s);
            if (st != null) {
                OOSlide geo_slide = new OOSlide(s, st);

                Iterator<Textbox> tb_itr = s.getTextboxIterator();
                while (tb_itr.hasNext()) {
                    Textbox tb = tb_itr.next();
                    SlideElement selm = this.getSlideElementByString(tb, tb.getTitle());
                    if (selm == null) {
                        selm = this.getSlideElementByString(tb, tb.getName());
                        if (selm == null) {
                            selm = this.getSlideElementByString(tb, tb.getTextContent().replaceAll("$", "").replaceAll("\\{", "").replaceAll("}", ""));
                        }
                    }
                    if (selm != null) {
                        geo_slide.addElement(selm);
                    }

                }
                return_slides.put(st, geo_slide);
            }
        }

        return return_slides;
    }


    private SlideType getSlideTypeByTitle(Slide s) {
        switch (s.getSlideName().toLowerCase()) {
            case "map": {
                return SlideType.MAP_SLIDE;
            }
            case "mapandlegend": {
                return SlideType.MAPLEGEND_SLIDE;
            }
            case "mapandfeature":
            case "mapandfeatures": {
                return SlideType.MAPFEATURE_SLIDE;
            }
            case "mapandfeaturesandlegend":
            case "mapandlegendandfeatures":
            case "mapandfeatureandlegend":
            case "mapandlegendandfeature": {
                return SlideType.MAPFEATURELEGEND_SLIDE;
            }
            default:
                return null;
        }
    }

    private SlideType getSlideTypeByElements(Slide s) {
        throw new NotImplementedException();
    }


    private SlideElement getSlideElementByString(Textbox tb, String genField) {
        switch (genField) {
            case "map": {
                return new SlideElement(SlideElementType.MAP, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "legend": {
                return new SlideElement(SlideElementType.LEGEND, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "feature":
                return new SlideElement(SlideElementType.FEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "features": {
                return new SlideElement(SlideElementType.FEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "selectedfeature":
                return new SlideElement(SlideElementType.SELECTEDFEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "selectedfeatures":
                return new SlideElement(SlideElementType.SELECTEDFEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            default:
                return null;
        }
    }

    private SlideElement _getSlideElementByTitle(Textbox tb) {
        switch (tb.getTitle().toLowerCase()) {
            case "map": {
                return new SlideElement(SlideElementType.MAP, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "legend": {
                return new SlideElement(SlideElementType.LEGEND, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "feature":
                return new SlideElement(SlideElementType.FEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "features": {
                return new SlideElement(SlideElementType.FEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "selectedfeature":
                return new SlideElement(SlideElementType.SELECTEDFEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "selectedfeatures":
                return new SlideElement(SlideElementType.SELECTEDFEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            default:
                return null;
        }
    }

    private SlideElement _getSlideElementByName(Textbox tb) {
        switch (tb.getName().toLowerCase()) {
            case "map": {
                return new SlideElement(SlideElementType.MAP, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "legend": {
                return new SlideElement(SlideElementType.LEGEND, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "feature":
                return new SlideElement(SlideElementType.FEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "features": {
                return new SlideElement(SlideElementType.FEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "selectedfeature":
                return new SlideElement(SlideElementType.SELECTEDFEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "selectedfeatures":
                return new SlideElement(SlideElementType.SELECTEDFEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            default:
                return null;
        }
    }

    private SlideElement _getSlideElementByTextContent(Textbox tb) {
        switch (tb.getTextContent().toLowerCase()) {
            case "${map}$": {
                return new SlideElement(SlideElementType.MAP, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "${legend}$": {
                return new SlideElement(SlideElementType.LEGEND, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "${feature}$":
                return new SlideElement(SlideElementType.FEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "${features}$": {
                return new SlideElement(SlideElementType.FEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            }
            case "${selectedfeature}$":
                return new SlideElement(SlideElementType.SELECTEDFEATURE, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());

            case "${selectedfeatures}$":
                return new SlideElement(SlideElementType.SELECTEDFEATURES, tb.getRectangle().getWidth(), tb.getRectangle().getHeight(), tb.getRectangle().getX(), tb.getRectangle().getY());
            default:
                return null;
        }
    }
}
