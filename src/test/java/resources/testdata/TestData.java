package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "CV Test")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "5 miles", "30000", "500000", "Per annum",
                        "Permanent","Permanent Tester jobs in Harrow"},

                {"Tester", "Wembley", "10 miles", "20000", "50000", "Per annum",
                        "Permanent","Permanent Tester jobs in Wembley"},

                {"Tester", "London", "15 miles", "35000", "70000", "Per annum",
                        "Permanent","Permanent Tester jobs in London"},

                {"Tester", "Leicester", "40 miles", "30000", "70000", "Per annum",
                        "Permanent","Permanent Tester jobs in Leicester"},

                {"Tester", "Luton", "50 miles", "30000", "70000", "Per annum",
                        "Permanent","Permanent Tester jobs in Luton"},

                {"Tester", "Manchester", "60 miles", "40000", "70000", "Per annum",
                        "Permanent","Permanent Tester jobs in Manchester"}
        };
        return data;
    }
}
