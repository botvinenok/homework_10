package com.hillel.company;

import java.util.Objects;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return Objects.equals(first, example.first) &&
                Objects.equals(last, example.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }
}
