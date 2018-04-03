package ru.maximov.kotlininaction.ch06.collections.fromjava;

import java.util.List;

public interface DataParser<T> {

    void parseData(
            String input,
            List<T> output,
            List<String> errors
    );
}
