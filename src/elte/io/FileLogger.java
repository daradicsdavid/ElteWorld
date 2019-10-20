package elte.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger {

    private static FileLogger instance;
    private static final String FILE_PATH = "out.log";
    private final PrintWriter out;

    private FileLogger() throws IOException {
        out = new PrintWriter(new FileWriter(FILE_PATH));
    }

    public static FileLogger getInstance() {
        if (instance == null) {
            try {
                instance = new FileLogger();
            } catch (IOException e) {
                System.out.println("Could not initialize logger! " + e.getMessage());
            }
        }
        return instance;
    }

    public void log(String message) {
        out.println(message);
    }

    public void close() {
        out.close();
    }
}