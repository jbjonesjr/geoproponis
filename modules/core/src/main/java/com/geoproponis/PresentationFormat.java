package com.geoproponis;

/**
 * Created with IntelliJ IDEA.
 * User: jbjonesjr
 * Date: 1/24/15
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public enum PresentationFormat {

    ODP("odp","openoffice"),
    ODTP("odtp","openoffice"),
    PPT("ppt","microsoftoffice"),
    PPTX("pptx","microsoftoffice"),
    PDF("pdf","acrobatpdf");

    private String type;
    private String extension;
    private String family;

    PresentationFormat(String filename){
        this.extension = filename.substring(filename.lastIndexOf("."));
    }

    PresentationFormat(String ext, String fam){
        this.extension = ext;
        this.family = fam;
    }

    public String getFamily() {
        return family;
    }

    public String getExtension() {
        return extension;
    }

    public String getType() {

        return type;
    }
}
