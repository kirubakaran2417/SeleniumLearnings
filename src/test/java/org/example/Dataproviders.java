package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
    //dataprovider-> this is used to pass the data to the test
    @DataProvider(name="testdata")
    public String[][] getData() {

        return new String[][] {
                { "Selenium", "Automation" },
                { "Java", "Automation" },
                { "Python", "Automation" } };
    }

    @Test(dataProvider = "testdata")
    public void test1(String name, String course) {
        System.out.println(name+" "+course);
    }
}
