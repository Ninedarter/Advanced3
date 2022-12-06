package jsonMapper.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonMapper.entity.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataMapperService {

    /**
     * Converts given json file to Person list.
     * @param filePath representing file location of json.
     * @return constructed list of Person prom given json data.
     */
    public List<Person> convertJsonToList(String filePath) throws IOException {
        //1. Nuskaitom json faila ir patalpinam i eilute.
        String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
        //2. Konvertuojam nuskaityta eilute i sarasa
        List<Person> people = new ObjectMapper().readValue(jsonString,new TypeReference<>() {});

        //3. Grazinam turima sarasa.

        return people;
    }
}
