package org.example;
import com.google.gson.Gson;
import modelos.Persona;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Main {
    public static void main(String[] args)  {
        Gson gson = new Gson();
            try {
                FileReader file =new FileReader("src/main/resources/datos/empleados.json");
                BufferedReader reader=new BufferedReader(file);
                Persona persona=new Gson().fromJson(file, Persona.class);
                System.out.println(persona);
            } catch (IOException e){
                System.out.println("no existe el archivo");
            }

    }
}