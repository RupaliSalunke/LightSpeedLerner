package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	private static ExtentReports extent;
	private static ExtentTest test;
    private static ExtentHtmlReporter htmlReporter;

	// Initialize Extent Reports with the default constructor
	public static void initializeExtentReport() {
		extent = new ExtentReports();
	}

	// Initialize Extent Reports with a specified report path
	public static void initializeExtentReport(String reportPath) {
        reportPath = System.getProperty("user.dir") + "\\extentreports\\";

        htmlReporter = new ExtentHtmlReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

	public static void createTest(String testName) {
		test = extent.createTest(testName);
	}

	public static void logInfo(String message) {
		test.log(Status.INFO, message);
	}

	public static void logPass(String message) {
		test.log(Status.PASS, message);
	}

	public static void logFail(String message) {
		test.log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));
	}

	public static void logSkip(String message) {
		test.log(Status.SKIP, MarkupHelper.createLabel(message, ExtentColor.ORANGE));
	}

	public static void flushExtentReport() {
		extent.flush();
	}
}
