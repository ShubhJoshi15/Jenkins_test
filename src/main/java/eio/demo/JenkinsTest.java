package eio.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JenkinsTest {

    public void getDataFromJenkins(String[] datafromUser){
        List<String> objectCode = new ArrayList<>();

        objectCode.addAll(Arrays.asList(datafromUser));

        System.out.println(objectCode);
    }
}
