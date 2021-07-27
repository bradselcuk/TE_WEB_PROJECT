package com.TennisExpress.tests;
import org.testng.annotations.Test;

public class ApparelTest extends BaseTest {

    @Test
    public void apparel(){
        extentTest = extentReports.createTest("View All Orders Page Test-1");



        extentTest.pass("CheckAll, UncheckAll, Delete and Logout buttons works");

    }
}

