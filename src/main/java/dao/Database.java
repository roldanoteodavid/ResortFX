package dao;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import config.Configuracion;
import domain.modelo.Actividad;
import lombok.extern.log4j.Log4j2;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Log4j2

public class Database {

    /*public List<Animal> loadAnimales() {
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<Animal>>() {}.getType();

        List<Animal> animals = null;
        try {
            animals = gson.fromJson(
                    new FileReader(new Configuracion().loadPathProperties()),
                    userListType);
        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        return animals;
    }

    public boolean saveAnimales(List<Animal> animals) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter fw = new FileWriter(new Configuracion().loadPathProperties())) {
            gson.toJson(animals, fw);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return false;
        }
        return true;
    }*/

    public List<Actividad> loadActividades() {
        Gson gson = new Gson();
        Type userListType = new TypeToken<ArrayList<Actividad>>() {}.getType();

        List<Actividad> actividades = null;
        try {
            actividades = gson.fromJson(
                    new FileReader(new Configuracion().loadPathPropertiesAct()),
                    userListType);
        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        return actividades;
    }

    public boolean saveActividades(List<Actividad> actividades) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter fw = new FileWriter(new Configuracion().loadPathPropertiesAct())) {
            gson.toJson(actividades, fw);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return false;
        }
        return true;
    }

    /*public void convertirJson(){
        //metodo Pablo
        Gson gson = new Gson();
        String actividadesJson = gson.toJson(actividades);
        try (FileWriter fileWriter = new FileWriter("actividades.json")) {
            fileWriter.write(actividadesJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Actividad> leerJson() {
        //metodo Pablo
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            File archivo = new File("actividades.json");
            if (!archivo.exists()) {
                archivo.createNewFile();
                return actividades;
            }
            try (FileReader fileReader = new FileReader(archivo)) {
                Type actividadListType = new TypeToken<ArrayList<Actividad>>(){}.getType();
                actividades = gson.fromJson(fileReader, actividadListType);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return actividades;
    }*/
}
