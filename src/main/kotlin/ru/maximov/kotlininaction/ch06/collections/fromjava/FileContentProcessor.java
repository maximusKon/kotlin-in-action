package ru.maximov.kotlininaction.ch06.collections.fromjava;

import java.io.File;
import java.util.List;

public interface FileContentProcessor {

    void processContents(
            File path,
            byte[] binaryContents,
            List<String> textContents
    );

}
