package jsonMapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {

    private String name;
    private int age;
    private  String country;
    //svarbu pavadinimas devices, kad sutaptu su JSON objekto
    private List<Device> devices;

}
