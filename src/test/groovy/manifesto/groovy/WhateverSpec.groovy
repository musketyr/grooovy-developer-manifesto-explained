package manifesto.groovy

import spock.lang.Specification
import spock.lang.Unroll

class WhateverSpec extends Specification {

@Unroll
void 'given a=#a and b=#b we should get result'() {
    expect:
        new String(new Whatever().doSomeStuff(a, b, c)) == result
    where:
        a  | b  | c | result
        0  | 0  | 0 | "0 about other developers"
        1  | 2  | 0 | "I don't care about other developers"
        -1 | -2 | 0 | "I don't care anyway about other developers"
}

}
