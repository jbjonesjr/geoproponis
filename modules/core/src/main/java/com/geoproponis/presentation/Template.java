package com.geoproponis.presentation;

import com.geoproponis.PresentationFormat;
import com.geoproponis.Slide;
import com.geoproponis.SlideType;

import java.io.File;
import java.util.Map;
import java.util.Set;


public class Template {

   PresentationFormat format;
    File templateFile;
    Map<SlideType, Slide> slides;


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
        return this.slides.keySet();
    }

   Slide getSlide(SlideType st){
       if(slides.containsKey(st))
       return slides.get(st);
       else
           return null;
   }
}
