package lib.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
    private static final String propertiesFileName = "./src/main/java/resources/config.properties";
    private static final Properties prop = new Properties();

    static {
        try {
            FileInputStream input = new FileInputStream(propertiesFileName);
            prop.load(input);
        } catch (IOException var1) {
            var1.printStackTrace();
        }
    }

    public static String getURLGoogle() {
        return prop.getProperty("urlGoogle");
    }

    public static String getURLGmail() {
        return prop.getProperty("urlGmail");
    }

    public static String getURLLogoutGmail() {
        return prop.getProperty("urlLogoutGmail");
    }

    public static String getBrowser() {
        return prop.getProperty("browser");
    }

    public static boolean getHeadless() {
        return prop.getProperty("headless").equals("true");
    }
}
