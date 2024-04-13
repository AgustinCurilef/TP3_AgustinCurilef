package ejercicio2;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum CsvKey {
    PERMALINK,
    COMPANY_NAME,
    NUMBER_EMPLOYEES,
    CATEGORY,
    CITY,
    STATE,
    FUNDED_DATE,
    RAISED_AMOUNT,
    RAISED_CURRENCY,
    ROUND
}

public class Recaudacion {
    private List<String[]> csvDatos = new ArrayList<String[]>();

    public Recaudacion(String url) throws CsvValidationException, IOException {
        this.csvDatos = new CSVFileReader(url).leerCSV();
    }


    public List<Map<String, String>> where(Map<String, String> options) {

        Filtro unLambda = (dato, valor) -> dato.equals(valor);
        FiltrarPor(options, CsvKey.COMPANY_NAME.toString().toLowerCase(), 1, unLambda);

        FiltrarPor(options, CsvKey.CITY.toString().toLowerCase(), 4, unLambda);

        FiltrarPor(options, CsvKey.STATE.toString().toLowerCase(), 5, unLambda);

        FiltrarPor(options, CsvKey.ROUND.toString().toLowerCase(), 9, unLambda);

        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (String[] csvDato : csvDatos) {
            Map<String, String> mapped = new HashMap<String, String>();
            for (int i = 0; i < csvDato.length; i++) {
                mapped.put(CsvKey.values()[i].toString().toLowerCase(), csvDato[i]);
            }
            output.add(mapped);
        }
        return output;
    }

    private void FiltrarPor(Map<String, String> options, String key, int posicion, Filtro filtrarPor) {
        if (options.containsKey(key)) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] csvDato : csvDatos) {
                if (filtrarPor.Filtrar(csvDato[posicion], options.get(key))) {
                    results.add(csvDato);
                }
            }
            csvDatos = results;
        }
    }
}