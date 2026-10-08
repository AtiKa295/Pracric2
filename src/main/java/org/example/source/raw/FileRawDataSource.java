package org.example.source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileRawDataSource implements RawDataSource {

    private final String filePath;

    public FileRawDataSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String> getRawData() {
        try {
            return Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Не удалось прочитать файл" + filePath, e);
        }
    }
}
