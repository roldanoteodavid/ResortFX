package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuracion {

    public String loadPathProperties(){
        Properties properties= new Properties();
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            properties.load(input);
            return (String)properties.get("pathJson");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;//path no encontrado
    }

    public String loadPathPropertiesAct(){
        Properties properties= new Properties();
        try {
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            properties.load(input);
            return (String)properties.get("pathJsonAct");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;//path no encontrado
    }
}
