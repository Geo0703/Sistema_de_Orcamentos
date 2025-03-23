/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author geova_16fe4ev
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Counter {

    private static final String FILE_NAME = "ID.txt";
    private int count;

    public Counter() {
        this.count = loadCount();
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
        saveCount();
    }

    private int loadCount() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = reader.readLine();
            if (line != null) {
                return Integer.parseInt(line);
            }
        } catch (IOException | NumberFormatException e) {
            // Se o arquivo não existir ou houver um erro, começamos do zero
            return 0;
        }
        return 0;
    }

    private void saveCount() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(String.valueOf(count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

