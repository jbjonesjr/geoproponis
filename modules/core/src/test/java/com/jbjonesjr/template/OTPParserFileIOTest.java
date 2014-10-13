package com.jbjonesjr.template;


import com.jbjonesjr.OTPParser;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.odftoolkit.simple.PresentationDocument;

import java.io.IOException;
import java.io.InputStream;


public class OTPParserFileIOTest {

    public Logger logger = Logger.getLogger(OTPParserFileIOTest.class);
    OTPParser parser;

    @Before
    public void setup() {
        parser = new OTPParser();
    }

    @Test
    public void openFileStreamTest() {
        InputStream fis;
        try {
            fis = OTPParserFileIOTest.class.getClassLoader().getResourceAsStream("template_basic.otp");
        } catch (Exception e) {
            logger.error(e);
            Assert.fail("problem finding test otp file. Exception: " + e.getMessage());
            return;
        }

        try{
            PresentationDocument.loadDocument(fis);
        }catch(Exception e){
            Assert.fail("Problem opening the OTP file as a presentation document");
        }finally {
            try{
                fis.close();
            }catch(Exception e){
                logger.error("What the heck happened to closing the stream?",e);
            }
        }

    }

    @Test(expected = IOException.class)
    public void streamClosedTest() throws Exception {
        InputStream fis;
        try {
            fis = OTPParserFileIOTest.class.getClassLoader().getResourceAsStream("template_basic.otp");
        } catch (Exception e) {
            logger.error(e);
            Assert.fail("problem finding test otp file. Exception: " + e.getMessage());
            return;
        }
        parser.prepare(fis);

        try{
            fis.available();
            Assert.fail("FileStream is still open");
        }catch(Exception e){
            throw e;
        }
    }
}