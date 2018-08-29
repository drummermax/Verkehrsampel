package main;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		System.setProperty("java.library.path",
				System.getProperty("java.library.path") + ";" + System.getProperty("user.dir") + "\\extlib");
		Field fieldSysPath = null;

		fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
		fieldSysPath.setAccessible(true);
		fieldSysPath.set(null, null);

		System.out.println(System.getProperty("java.library.path"));

		RS232.getInstance();

		GUI gui = new GUI();
	}

}
