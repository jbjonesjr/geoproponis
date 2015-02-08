package com.geoproponis;


import java.util.List;
import java.util.Map;

/**
 * Usage:
 * Instantiate the implementation.
 * Call prepare passing in the template details (only required implementation is inputstream)
 * Call process to generate the slides and geoproponis objects
 *
 */
public interface Parser {

    List<PresentationFormat> validPresentationFormats();

    Map<SlideType, Slide>  process(String filename) throws Exception;
    int getNativeSlideCount();
}
