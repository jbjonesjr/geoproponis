package com.geoproponis.slide;

import com.geoproponis.Slide;
import com.geoproponis.parser.OTPParser;
import com.geoproponis.Parser;
import org.odftoolkit.simple.draw.Textbox;

import java.io.FileInputStream;
import java.util.Iterator;


public class OOSlide implements Slide {
    protected Parser parser;

    private org.odftoolkit.simple.presentation.Slide slide;

    public OOSlide(FileInputStream fis){
        parser = new OTPParser();
        ((OTPParser)parser).prepare(fis);
    }

    @Override
    public String getMap() {
        slide = parser.getMapSlide();
        Iterator<Textbox> tbitr = slide.getTextboxIterator();
        while(tbitr.hasNext()){
            if(tbitr.next().getTextContent().equalsIgnoreCase("Slide (Map and Features) By Name")){
                return;
            }
        }

        return null;  //To change body of implemented methods use File | Settings | File Templates.

    }

    @Override
    public Boolean Map() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getLegend() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getScale() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getFeatures() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
