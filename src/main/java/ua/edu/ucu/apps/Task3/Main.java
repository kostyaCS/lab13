package ua.edu.ucu.apps.Task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String apiKey = ""; // should work as I think, but when I was doing this, PeopleLabs didn't give me access
        Facade facade = new Facade(apiKey);

        try {
            Company company = facade.getAllInfo("ucu.edu.ua");
            System.out.println(company);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
