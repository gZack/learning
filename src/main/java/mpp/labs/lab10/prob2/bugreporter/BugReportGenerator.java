package mpp.labs.lab10.prob2.bugreporter;

import mpp.labs.lab10.prob2.classfinder.ClassFinder;

import java.io.*;
import java.lang.annotation.Annotation;
import java.util.List;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 *
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "mpp.labs.lab10.prob2.javapackage";//"lesson10.labs.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() throws IOException {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		classes.stream().forEach(System.out::println);
		//implement

		Map<String, List<Class<?>>> map = classes.stream()
				.collect(Collectors.groupingBy(o -> o.getAnnotation(BugReport.class).assignedTo()));

		File file = new File("bug_report.txt");

		if(!file.exists()){
			file.createNewFile();
		}
		Writer fr = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fr);

		for(String key : map.keySet()){
			bw.write(key + "\n");
			for(Class eachClass : map.get(key)){
				BugReport bugReportAnot = (BugReport) eachClass.getAnnotation(BugReport.class);
				String reportedBy = bugReportAnot.reportedBy();
				String className = eachClass.getName();
				String description = bugReportAnot.description();
				int severity = bugReportAnot.severity();

				if(reportedBy != null && !reportedBy.isEmpty())
					bw.write("\t" + "reportedBy" + ":" +reportedBy + "\n");

				bw.write("\t" + "classname:" + className + "\n");
				if(description != null && !description.isEmpty())
					bw.write("\t" + "description" + ":" + description + "\n");

				bw.write("\t" + "severity" + ":" + severity+ "\n");

				bw.write("\n");

			}
		}

		bw.close();

		int x = 0;

	}


}
