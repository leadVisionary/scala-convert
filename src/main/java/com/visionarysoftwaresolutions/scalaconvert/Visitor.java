package com.visionarysoftwaresolutions.scalaconvert;

public interface Visitor<T> {
    void visit(T toVisit);
}
