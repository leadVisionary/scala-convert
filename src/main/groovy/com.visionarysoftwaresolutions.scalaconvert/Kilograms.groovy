package com.visionarysoftwaresolutions.scalaconvert

import groovy.transform.Immutable

@Immutable
class Kilograms implements JavaMeasurable {
    BigDecimal value

    @Override
    def <T extends Visitor<JavaMeasurable>> void accept(final T visitor) {
        visitor.visit(this)
    }
}
