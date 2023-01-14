package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private static Properties properties;
    private static final String propertyFilePath = "//src//test//resources//properties//global.properties";


//    public ConfigFileReader()
    static
    {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUrl()
    {
        return properties.getProperty("qaUrl");
    }

    public String getBrowser()
    {
        return properties.getProperty("browser");
    }
}