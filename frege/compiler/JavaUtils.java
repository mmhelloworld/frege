package frege.compiler;

// import frege.Prelude;
import frege.MD;

import java.net.MalformedURLException;
import java.net.URLClassLoader;
import java.lang.annotation.*;

/*
 * $Revision: 77 $
 * $Id: JavaUtils.java 77 2011-01-08 16:57:11Z ingo $
 * $Author: ingo $
 */

public class JavaUtils {

    public static MD.FregePackage getFrege(ClassLoader loader, String pack) throws ClassNotFoundException {
		Class<?> cl = null;
	    cl = loader.loadClass(pack);
		return cl.getAnnotation(MD.FregePackage.class);
	}

    // left for backward compatibility
	public static MD.Operator[] getOperators(ClassLoader loader, String pack) throws ClassNotFoundException {
		Class<?> cl = null;
	    cl = loader.loadClass(pack);
		MD.FregePackage os = cl.getAnnotation(MD.FregePackage.class);
		if (os == null) return null;
		return os.ops();
	}


	public static int runJavac(final String cmd) {
		try {
			// String cmd = "javac -cp " + cp + " -d " + d + " " + src;
			int cex = 0;
			Process jp = Runtime.getRuntime().exec(cmd);
			// if (Common.verbose)
				System.err.println("running: " + cmd);
			java.io.InputStream is = jp.getErrorStream();
			while ((cex = is.read()) >= 0) {
				System.err.write(cex);
			}
			if ((cex = jp.waitFor()) != 0) {
				System.err.println("javac terminated with exit code " + cex);
			}
			return cex;
		} catch (java.io.IOException e) {
			System.err.println("Can't javac  (" + e.getMessage() + ")");
		} catch (InterruptedException e) {
			System.err.println("Can't javac  (" + e.getMessage() + ")");
		}
		return 1;
	}



}
