package ua.edu.ucu.apps.Task3;

import java.io.IOException;

public class Facade {
    private PDLReader pdlReader;

    public Facade(String apiKey) {
        pdlReader = new PDLReader(apiKey);
    }

    public Company getAllInfo(String website) throws IOException {
        return pdlReader.getCompanyInfo(website);
    }
}
