package com.geoproponis.presentation;

import com.geoproponis.PresentationFormat;
import com.geoproponis.Slide;
import com.geoproponis.SlideType;

import java.io.File;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 1/24/15
 * Time: 4:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Template {

   PresentationFormat format;
    File templateFile;
    Map<SlideType, Slide> slides;
    Set<SlideType> types;



    public PresentationFormat getFormat() {
        return format;
    }

    public void setFormat(PresentationFormat format) {
        this.format = format;
    }

    public File getTemplateFile() {
        return templateFile;
    }

    public void setTemplateFile(File templateFile) {
        this.templateFile = templateFile;
    }

    public Map<SlideType, Slide> getSlides() {
        return slides;
    }

    public void setSlides(Map<SlideType, Slide> slides) {
        this.slides = slides;
    }

    public int getSlideCount(){
        return slides.size();
    }

    public Set<SlideType> getTypes() {
        return types;
    }

    public void setTypes(Set<SlideType> types) {
        this.types = types;
    }
}
