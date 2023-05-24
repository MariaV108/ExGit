package collections;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Properties;

public class Prop {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");

        Properties properties1 = new Properties();
        String lang = properties1.getProperty("lang", "English");

        Properties defprop = new Properties();
        defprop.setProperty("lang", "English");

        Properties newProp = new Properties(defprop);
        String lan = newProp.getProperty("lang");
        System.out.println("lang " + lan);

        Class aClass = Prop.class;
        InputStream inputStream1 = aClass.getResourceAsStream("/myProp.prop");
        Properties fromClasspath = new Properties();

        try {
            fromClasspath.load(inputStream1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator keys = properties.keySet().iterator();

        try (FileWriter output = new FileWriter("sdfasdfasdg", Charset.forName("UTF-8"))) {
            properties.store(output, "Propert");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("sdfasf", Charset.forName("UTF-8"))) {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream outputStream = new FileOutputStream("sdfas")) {
            properties.storeToXML(outputStream, "Prop", Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream inputStream = new FileInputStream("sdfas")) {
            properties.loadFromXML(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


        int r = 0;
    }

}
