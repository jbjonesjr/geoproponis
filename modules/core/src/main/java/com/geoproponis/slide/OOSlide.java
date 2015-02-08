package com.geoproponis.slide;

import com.geoproponis.*;
import com.geoproponis.Slide;
import com.geoproponis.parser.OTPParser;
import org.odftoolkit.simple.draw.Textbox;
import org.odftoolkit.simple.presentation.*;

import java.io.FileInputStream;
import java.util.*;


public class OOSlide implements Slide {

    private org.odftoolkit.simple.presentation.Slide slide;
    private SlideType st;
    private Map<SlideElementType, SlideElement> elems = null;
    public OOSlide(org.odftoolkit.simple.presentation.Slide ooslide, SlideType st){
        this.slide = ooslide;
        elems = new HashMap<SlideElementType, SlideElement>();
    }

    public Object getSlide() {
        return slide;
    }

    public SlideType getSlideType() {
        return st;
    }

    public boolean addElement(SlideElement se){
        elems.put(se.getType(),se);
        return true;

    }

    public SlideElement getElement(SlideElementType set){
        return elems.get(set);
    }
}
