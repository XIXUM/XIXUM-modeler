package org.xixum.modeler.core.application;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.python.pydev.core.interpreters.IInterpreterNewCustomEntries;

public class InterpreterNewCustomEntries1 implements IInterpreterNewCustomEntries {

	public InterpreterNewCustomEntries1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Collection<String> getAdditionalLibraries() {
		// TODO Auto-generated method stub
		
		return findPlugins();
		
		
//		return null;
	}

	@Override
	public Collection<String> getAdditionalEnvVariables() {
		// TODO Auto-generated method stub
		return new ArrayList<String>();
	}

	@Override
	public Collection<String> getAdditionalBuiltins() {
		// TODO Auto-generated method stub
		return new ArrayList<String>();
	}

	@Override
	public Map<String, String> getAdditionalStringSubstitutionVariables() {
		// TODO Auto-generated method stub
		return new HashMap<String,String>();
	}
	
    public static List<String> findPlugins() {
        List<String> wildcardPaths = new ArrayList<>();
        wildcardPaths.add("org.xixum.modeler.core*.jar");
        wildcardPaths.add("org.apache.felix.scr*.jar");
        wildcardPaths.add("org.apache.poi.poi*.jar");
        wildcardPaths.add("org.eclipse.emf.common*.jar");
        wildcardPaths.add("org.eclipse.emf.ecore*.jar");
        wildcardPaths.add("org.xixum.modeler.core.model.design*.jar");
        wildcardPaths.add("org.xixum.modeler.core.model.edit*.jar");
        wildcardPaths.add("org.xixum.modeler.core.model*.jar");
        wildcardPaths.add("org.xixum.modeler.core.mmanip.ui*.jar");
        wildcardPaths.add("org.xixum.modeler.core.mmanip*.jar");
        wildcardPaths.add("org.xixum.modeler.core*.jar");
    
        wildcardPaths.add("org.eclipse.emf.edit*.jar");
    
        wildcardPaths.add("org.eclipse.emf.ecore.xmi*.jar");
    
        wildcardPaths.add("org.eclipse.emf.ecore.change*.jar");
    
        wildcardPaths.add("org.eclipse.osgi*.jar");
        wildcardPaths.add("org.eclipse.e4.core.contexts*.jar");
        wildcardPaths.add("org.eclipse.equinox.preferences*.jar");
    
        wildcardPaths.add("org.apache.commons.commons-io*.jar");
        wildcardPaths.add("org.eclipse.core.commands*.jar");
    
        wildcardPaths.add("org.eclipse.core.runtime*.jar");
    
        wildcardPaths.add("org.eclipse.equinox.common*.jar");
		wildcardPaths.add("org.eclipse.core.runtime*.jar");
		wildcardPaths.add("org.eclipse.ui.workbench*.jar");
		wildcardPaths.add("org.eclipse.jface*.jar");
	
        wildcardPaths.add("org.xixum.modeler.core.python_*");
        
        String log4j12 = "\\lib\\log4j-1.2-api-2.17.1.jar";
        String log4j = "\\lib\\log4j-api-2.17.1.jar";
        String log4jcore = "\\lib\\log4j-core-2.17.1.jar";
        
        String directoryPath = "plugins"; // Replace with your directory path
        
        List<String> resolvedPaths = resolveWildcardPaths(wildcardPaths, directoryPath);
        //TODO: should select python api plugin
        Optional<String> resolved = resolvedPaths.stream().filter(p -> p.contains("org.xixum.modeler.core.python")).findFirst();
        if (resolved.isPresent()) {
	        File firstEntry = new File(resolvedPaths.remove(resolvedPaths.size()-1));  
	        String tcmPythonPath = "";
	        if (firstEntry.isFile())
	        	tcmPythonPath = firstEntry.getParent();
	        else
	        	tcmPythonPath = firstEntry.getAbsolutePath();
	        resolvedPaths.add(Paths.get(tcmPythonPath, log4j12).toString());
	        resolvedPaths.add(Paths.get(tcmPythonPath,log4j).toString());
	        resolvedPaths.add(Paths.get(tcmPythonPath,log4jcore).toString());
    	}   
        for (String path : resolvedPaths) {
            System.out.println(path);       
        }
        return resolvedPaths;
    }

    public static List<String> resolveWildcardPaths(List<String> wildcardPaths, String directoryPath) {
        List<String> resolvedPaths = new ArrayList<>();
        File directory = new File(directoryPath);
        String workingDirectory = System.getProperty("user.dir");
        
        if (directory.exists() && directory.isDirectory()) {
            for (String wildcardPath : wildcardPaths) {
                String regex = wildcardPath.replace(".", "\\.").replace("*", ".*");
                Pattern pattern = Pattern.compile(regex);

                for (String filename : directory.list()) {
                    Matcher matcher = pattern.matcher(filename);

                    if (matcher.matches()) {
                        resolvedPaths.add(new File(workingDirectory, directory + File.separator + filename).getAbsolutePath());
                    }
                }
            }
        } else {
            System.err.println("Directory not found: " + directoryPath);
        }

        return resolvedPaths;
    }

}
