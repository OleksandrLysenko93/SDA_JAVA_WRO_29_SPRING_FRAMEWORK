package pl.honestit.spring.core.components.printers;

import pl.honestit.spring.core.components.Printer;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePrinter implements Printer {
    @Override
    public void print(String message) {
        //System.out.println("file: " + message);

        String userHomePath = System.getProperty("user.home");
        Path outputPath = Paths.get(userHomePath, "out.log");
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(outputPath.toFile(), true))) {

            printWriter.println(message);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
