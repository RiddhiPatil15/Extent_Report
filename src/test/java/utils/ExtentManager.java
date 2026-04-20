package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {

            // Create folder if it doesn't exist
            String reportDir = "target/extentreports/";
            File dir = new File(reportDir);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            // Set report path inside folder
            ExtentSparkReporter reporter = new ExtentSparkReporter(reportDir + "ExtentReport.html");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }
}
