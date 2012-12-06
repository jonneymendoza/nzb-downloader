package com.josh.nzb.downloader.utils.logtracking;

import android.util.Log;

/**
 * @author RichardsJ App logs used in debug mode. if we recieve any exceptions, create an email and send it to my email
 *         address so i can automaticaly view and be notified of crash logs
 */
public class AppLog {

	public static void print(String message) {

		String tag = getClassName();

		Log.d(tag, message);
	}

	public static void printAndSendLog(String message) {

		String tag = getClassName();

		Log.d(tag, message);

		sendLogEmail();
	}

	private static void sendLogEmail() {

	}

	private static String getClassName() {
		// get throwable object for use for seeing who called this static method

		Throwable t = new Throwable();

		try {
			StackTraceElement[] elements = t.getStackTrace();

			// for (int i = 0; i < elements.length; i++) {
			//
			// }

			return elements[2].getClass().getSimpleName();

		} finally {
			t = null;
		}

	}

	/**
	 * Get simple class name in the format that is expected from a package class name of com.a.b.className
	 *
	 * @param className the full class name ie com.a.b.Classname
	 * @return returns the ClassName string only, removing "com.a.b"
	 */
	private static String getSimpleClassName(String className) {


		String[] names = className.split("\\.");

		for (int i = 0; i < names.length; i++) {
			Log.d("", "names =" + names[i]);
		}

		return names[names.length - 1];
	}

	class ExceptionHandler implements Thread.UncaughtExceptionHandler {

		/*
		 * (non-Javadoc)
		 * @see java.lang.Thread.UncaughtExceptionHandler#uncaughtException(java.lang.Thread, java.lang.Throwable)
		 */
		@Override
		public void uncaughtException(Thread thread, Throwable ex) {
			handle(ex);

		}

		public void handle(Throwable throwable) {
			try {
				// get uncaought exception message and send to email

				// all serious uncaougth exceptions should be logged and saved.
			} catch (Throwable t) {

			}
		}

	}

}
