package com.szypula.javakotlingroovy.foo

import spock.lang.Specification


class FooTest extends Specification {

    def "returns true"() {
        given:
        def tested = FooTestBuilder.INSTANCE.build()

        expect:
        tested.returnTrue()
    }
}
