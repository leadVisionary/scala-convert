package com.visionarysoftwaresolutions.groovyconvert;

public interface JavaMeasurable {
    <T extends Visitor<JavaMeasurable>> void accept(T visitor);
}
