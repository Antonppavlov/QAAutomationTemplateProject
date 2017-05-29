package su.qa.authomation.project.template.utils.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class OMPProperties {


    private static String mvnTestData = System.getProperty("testData");

    private static String getFileProperties(String name, String key) {
        Properties property = new Properties();
        String text = null;

        try {
            FileInputStream fis = new FileInputStream(
                     "src" + File.separator +
                            "main" + File.separator +
                            "resources" + File.separator +
                            "properties" + File.separator +
                            name + ".properties");
            property.load(fis);
            text = property.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

    public static String getTextElement(String key) {
        return getFileProperties("textElements", key);
    }

    public static String getConnectData(String key) {
        return getFileProperties("connect", key);
    }

    public static String getTestData(String key) {
        if (mvnTestData==null) {
            mvnTestData = "testDataMac";
            System.out.println("НЕ УКАЗАННЫ ФАЙЛ НАСТРОЕК!!!!\n ПО УМОЛЧАНИЮ ВЫБРАННЫ testDataMac !!!!!!");
        }

        return getFileProperties(mvnTestData, key);
    }
}

