package eio.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JenkinsTest {

    public void getDataFromJenkins(String[] datafromUser){
        List<String> objectCode = new ArrayList<>();

        for(String obj : datafromUser){
            objectCode.addAll(Collections.singleton(obj));
        }

        System.out.println(objectCode);
    }
}
