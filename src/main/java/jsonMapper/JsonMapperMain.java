package jsonMapper;

import jsonMapper.entity.Device;
import jsonMapper.entity.Person;
import jsonMapper.service.DataMapperService;

import java.io.IOException;
import java.util.List;

public class JsonMapperMain {
    public static void main(String[] args) throws IOException {
        DataMapperService dataMapperService = new DataMapperService();
     //namu darbam
        List<Person> people = dataMapperService.convertJsonToList("src/main/resources/person.json");
        for (Person person : people) {
            for (Device device : person.getDevices()) {
                System.out.println(device);
            }


        }

    }
}
