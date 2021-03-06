package com.visionarysoftwaresolutions.groovyconvert

import groovy.transform.Immutable

@Immutable
class Pounds implements JavaMeasurable {
    BigDecimal value

    @Override
    def <T extends Visitor<JavaMeasurable>> void accept(final T visitor) {
        visitor.visit(this)
    }
}
