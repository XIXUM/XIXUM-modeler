package org.xixum.modeler.core.application;

import org.python.pydev.ast.interpreter_managers.IInterpreterProvider;
import org.python.pydev.ast.interpreter_managers.IInterpreterProviderFactory;
import org.python.pydev.ast.interpreter_managers.IInterpreterProviderFactory.InterpreterType;
import org.python.pydev.ui.pythonpathconf.AlreadyInstalledInterpreterProvider;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterProviderParticipant1 implements IInterpreterProviderFactory{

	@Override
	public IInterpreterProvider[] getInterpreterProviders(InterpreterType type) {
		// TODO Auto-generated method stub
		String name = "DefaultJython"; 
		String interpreterPath = findInterpreter();
		System.out.print("Jython is added by using default location provided.\n");
		return AlreadyInstalledInterpreterProvider.create(name, interpreterPath);
		
	}
	
    public static String findInterpreter() {
        String wildcardPath = "org.xixum.modeler.core.python_*";
        String directoryPath = "plugins"; // Replace with your directory path
        String jarLocation = "\\lib\\jython27\\jython.jar";
        String resolvedPath = resolveWildcardPath(wildcardPath, directoryPath);

        if (resolvedPath != null) {
            System.out.println("Resolved Path: " + resolvedPath);
        } else {
            System.out.println("No matching file found.");
        }
        return resolvedPath + jarLocation;
    }

    public static String resolveWildcardPath(String wildcardPath, String directoryPath) {
        File directory = new File(directoryPath);
        String workingDirectory = System.getProperty("user.dir");

        if (directory.exists() && directory.isDirectory()) {
            String regex = wildcardPath.replace(".", "\\.").replace("*", ".*");
            Pattern pattern = Pattern.compile(regex);

            for (String filename : directory.list()) {
                Matcher matcher = pattern.matcher(filename);

                if (matcher.matches()) {
                    return new File(workingDirectory, directory + File.separator + filename).getAbsolutePath();
                }
            }
        } else {
            System.err.println("Directory not found: " + directoryPath);
        }

        return null; // No matching file found
    }
}

