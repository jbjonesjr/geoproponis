package com.geoproponis.presentation;

import com.geoproponis.Parser;
import com.geoproponis.PresentationFormat;
import com.geoproponis.parser.ODPParser;
import com.geoproponis.parser.ParserFactory;
import com.geoproponis.util.FileTypeInspector;

import java.io.File;
import java.util.ServiceLoader;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 2/7/15
 * Time: 5:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TemplateGenerator {

    public static Template getTemplate(String filename) {
        Template t = new Template();
        t.setTemplateFile(new File(filename));
        t.setFormat(FileTypeInspector.getFileFormat(filename));

        Parser p = ParserFactory.getParser(t.getFormat());

        try {
            t.setSlides(p.process(t.getTemplateFile()));
        } catch (Exception e) {

        }


        return t;
    }

}
