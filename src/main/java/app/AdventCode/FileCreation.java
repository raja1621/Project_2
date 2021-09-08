package app.AdventCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;

public class FileCreation {
    String RESOURCE_PATH = "/config/";

    public BufferedReader getFile(String fileName) throws URISyntaxException, IOException {
        InputStream classLoader = getClass().getResourceAsStream(RESOURCE_PATH + fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(classLoader, StandardCharsets.UTF_8);
        return new BufferedReader(inputStreamReader);
    }
}
