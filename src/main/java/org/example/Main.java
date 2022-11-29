package org.example;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String directory = "D:\\Google_bkp\\GooglePhotos";
        Path dir = Paths.get(directory);
        deleteFiles(dir);
    }

    public static void deleteFiles(Path directory) {
        try {
            Files.newDirectoryStream(directory).forEach(file -> {
                try {
                    File f = new File(file.toUri());
                    if(f.isDirectory())
                        deleteFiles(file);
                    if (file.getFileName().toString().endsWith("json"))
                        Files.delete( file ); }
                catch ( IOException e ) { throw new UncheckedIOException(e); }
            } );
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}