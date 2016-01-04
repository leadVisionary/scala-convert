package com.visionarysoftwaresolutions.groovyconvert;

public interface Visitor<T> {
    void visit(T toVisit);
}
