package com.kodilla.matrix.patterns2.adapter.bookclasifier.libraryb;

import java.util.Objects;

public class BookSignature {
    private final String signature;
    public BookSignature(final String signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSignature that = (BookSignature) o;
        return Objects.equals(signature, that.signature);
    }

    @Override
    public int hashCode() {
        return signature != null ? Objects.hash(signature) : 0;
    }

    @Override
    public String toString() {
        return  "SIGNATURE: '" + signature + "\'";
    }
}
