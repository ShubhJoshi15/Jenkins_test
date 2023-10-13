import eio.demo.JenkinsTest;

public class Main {

    static JenkinsTest jenkinsTest = new JenkinsTest();
    public static void main(String[] args)  {
        getDataFromUser(args);
    }

    public static void getDataFromUser(String[] objectCode){
        jenkinsTest.getDataFromJenkins(objectCode);
    }
}