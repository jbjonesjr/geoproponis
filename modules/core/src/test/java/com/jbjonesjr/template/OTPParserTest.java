package com.jbjonesjr.template;


import com.jbjonesjr.OTPParser;
import org.apache.log4j.Logger;
import org.junit.*;
import org.odftoolkit.simple.draw.Textbox;
import org.odftoolkit.simple.presentation.Slide;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

public class OTPParserTest {

    Logger logger = Logger.getLogger(OTPParserFileIOTest.class);
    OTPParser parser;
    InputStream fis;

    @Before
    public void setup(){
        parser = new OTPParser();
        try {
            fis = OTPParserTest.class.getClassLoader().getResourceAsStream("template_basic.otp");

        } catch (Exception e) {
            Assert.fail("problem finding test otp file. See OTPParserFileIOTests");
            return;
        }

        parser.prepare(fis);
    }

    @After
    public void tearDown(){
        try{
            fis.close();
        }catch(Exception e){
            logger.error("Trouble closing the otp file");
        }
    }

    @Test
    public void findMapSlideTest(){
        Assert.assertTrue("Can't find Map slide",  parser.hasMapSlide());
        Slide slide = parser.getMapSlide();
        Iterator<Textbox> tbitr = slide.getTextboxIterator();
        while(tbitr.hasNext()){
            if(tbitr.next().getTextContent().equalsIgnoreCase("Slide (Map) By Name")){
                return;
            }
        }
        Assert.assertTrue("Wrong slide returned. Never found the slide 'title' element",false);
    }

    @Test
    public void findFeaturesSlideTest(){
        Assert.assertTrue("Can't find Features slide",  parser.hasFeaturesSlide());
        Slide slide = parser.getFeaturesSlide();
        Iterator<Textbox> tbitr = slide.getTextboxIterator();
        while(tbitr.hasNext()){
            if(tbitr.next().getTextContent().equalsIgnoreCase("Slide (Features) By Name")){
                return;
            }
        }
        Assert.assertTrue("Wrong slide returned. Never found the slide 'title' element",false);
    }

    @Test
    public void findMapAndLegendSlideTest(){
        Assert.assertTrue("Can't find Map and Legend slide",  parser.hasMapAndLegendSlide());
        Slide slide = parser.getMapAndLegendSlide();
        Iterator<Textbox> tbitr = slide.getTextboxIterator();
        while(tbitr.hasNext()){
            if(tbitr.next().getTextContent().equalsIgnoreCase("Slide (Map and Legend) By Name")){
                return;
            }
        }
        Assert.assertTrue("Wrong slide returned. Never found the slide 'title' element",false);
    }

    @Test
    public void findMapAndFeatureSlideTest(){
        Assert.assertTrue("Can't find Map and Feature slide",  parser.hasMapAndFeaturesSlide());
        Slide slide = parser.getMapAndFeaturesSlide();
        Iterator<Textbox> tbitr = slide.getTextboxIterator();
        while(tbitr.hasNext()){
            if(tbitr.next().getTextContent().equalsIgnoreCase("Slide (Map and Features) By Name")){
                return;
            }
        }
        Assert.assertTrue("Wrong slide returned. Never found the slide 'title' element",false);
    }

    @Test
    public void findMapAndLegendAndFeaturesSlideTest(){
        parser.hasMapAndFeaturesAndLegendSlide();
        Assert.assertTrue("Can't find Map and Legend slide",  parser.hasMapAndFeaturesAndLegendSlide());
        Slide slide = parser.getMapAndFeaturesAndLegendSlide();
        Iterator<Textbox> tbitr = slide.getTextboxIterator();
        while(tbitr.hasNext()){
            if(tbitr.next().getTextContent().equalsIgnoreCase("Slide (Map, Legend, and Features) By Name")){
                return;
            }
        }
        Assert.assertTrue("Wrong slide returned. Never found the slide 'title' element",false);
    }

}
