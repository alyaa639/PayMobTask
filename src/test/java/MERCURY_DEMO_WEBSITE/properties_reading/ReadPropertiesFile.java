package MERCURY_DEMO_WEBSITE.properties_reading;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    //private static final String dataConfigPath = System.getProperty("user.dir") + "/resources/config/data.properties";
    public static final String LumaWebsiteConfigPath = System.getProperty("user.dir") + "/resources/config/url-Config.properties";

//    public static Properties setDataProperties() throws IOException {
//        Properties configProperties = new Properties();
//        FileInputStream inputStream = new FileInputStream(dataConfigPath);
//        configProperties.load(inputStream);
//        return configProperties;
//    }

    public static Properties setUrlsProperties() throws IOException {
        Properties configProperties = new Properties();
        FileInputStream inputStream = new FileInputStream(LumaWebsiteConfigPath);
        configProperties.load(inputStream);
        return configProperties;
    }
}
