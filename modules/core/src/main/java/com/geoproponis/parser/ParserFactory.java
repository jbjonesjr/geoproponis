package com.geoproponis.parser;

import com.geoproponis.Parser;
import com.geoproponis.PresentationFormat;
import org.springframework.context.ApplicationContext;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 2/8/15
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParserFactory {

    private static ApplicationContext ac;
    //TODO: Write bean post processor to detect duplicate format processors

    public static Parser getParser(PresentationFormat pf){
        Map<String, Parser> beans = ac.getBeansOfType(Parser.class);
        for (Parser p : beans.values()){
            if(p.validPresentationFormats().contains(pf))
                return p;
        }
        throw new RuntimeException("No parser found for the specified type, "+ pf.getFamily()+"/"+pf.getExtension());
    }
}
