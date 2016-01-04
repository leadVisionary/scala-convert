package com.visionarysoftwaresolutions.scalaconvert;

public interface JavaMeasurable {
    <T extends Visitor<JavaMeasurable>> void accept(T visitor);
}
