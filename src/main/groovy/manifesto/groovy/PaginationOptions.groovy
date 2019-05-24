package manifesto.groovy

import groovy.transform.CompileStatic

@CompileStatic
class PaginationOptions {

    static class Builder {
        private int offset
        private int limit = Integer.MAX_VALUE

        Builder offset(int offset) {
            this.offset = offset
            this
        }

        Builder limit(int limit) {
            this.limit = limit
            this
        }

        PaginationOptions build() {
            withLimitAndOffset(limit, offset)
        }
    }

    static PaginationOptions withLimitAndOffset(int limit, int offset) {
        return new PaginationOptions(offset, limit)
    }

    static PaginationOptions withLimit(int limit) {
        return withLimitAndOffset(limit, 0)
    }

    static PaginationOptions withOffset(int offset) {
        return withLimitAndOffset(Integer.MAX_VALUE, offset)
    }

    static PaginationOptions none() {
        return withLimitAndOffset(Integer.MAX_VALUE, 0)
    }

    final int offset
    final int limit

    PaginationOptions(int offset, int limit) {
        this.offset = offset
        this.limit = limit
    }


}
