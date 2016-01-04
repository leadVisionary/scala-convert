package com.visionarysoftwaresolutions.groovyconvert

class KilogramsToPounds implements Visitor<Kilograms> {
    Pounds calculated

    @Override
    void visit(final Kilograms toVisit) {
        calculated = new Pounds(value : toVisit.value.multiply(new BigDecimal(2.2046)))
    }
}
