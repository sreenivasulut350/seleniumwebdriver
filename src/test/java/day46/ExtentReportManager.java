package day46;

import org.testng.ITestListener;
//package com.qa.listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.io.File;

public class ExtentReportManager implements ITestListener
{
	private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        // Define report file path
        String reportFolderPath = System.getProperty("user.dir") + File.separator + "test-output";
        File folder = new File(reportFolderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        
        String reportFilePath = reportFolderPath + File.separator + "ExtentReport.html";
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFilePath);

        // Configure Report Layout
        sparkReporter.config().setDocumentTitle("Automation Execution Report");
        sparkReporter.config().setReportName("Functional Test Metrics");
        sparkReporter.config().setTheme(Theme.DARK);

        // Initialize ExtentReports system
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        
        // System Environment metadata
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        extent.setSystemInfo("Environment", "QA Production-Ready");
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create test entry for the reporting dashboard
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Executed Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, "Test Failed: " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Write data to the HTML file safely
        if (extent != null) {
            extent.flush();
        }
    }

}
