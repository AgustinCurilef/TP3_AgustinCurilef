package ejercicio2;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {
    private final String url;

    public CSVFileReader(String url) {
        this.url = url;
    }

    public List<String[]> leerCSV() throws IOException, CsvValidationException {
        List<String[]> csvDatos = new ArrayList<>();
        CSVReader lectura = new CSVReader(new FileReader(url));
        String[] fila = null;

        while ((fila = lectura.readNext()) != null) {
            csvDatos.add(fila);
        }
        lectura.close();
        csvDatos.remove(0);
        return csvDatos;
    }


}
