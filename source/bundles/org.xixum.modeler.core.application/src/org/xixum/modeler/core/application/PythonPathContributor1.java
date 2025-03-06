package org.xixum.modeler.core.application;

import org.eclipse.core.resources.IProject;
import org.python.pydev.plugin.nature.IPythonPathContributor;
//import org.xixum.modeler.core.application.PluginAccess;


public class PythonPathContributor1 implements IPythonPathContributor {

	public PythonPathContributor1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getAdditionalPythonPath(IProject aProject) {
		// TODO Auto-generated method stub
		String pathList = "";
				//"${ECLIPSE_HOME}\\plugins\\*";
//				"\\plugins\\com.google.guava_27.1.0.v20190517-1946.jar;"
//				+"\\plugins\\org.apache.felix.scr_2.1.16.v20200110-1820.jar;"
//				+"\\plugins\\org.apache.log4j_1.2.19.v20220208-1728.jar;"
//				+"\\plugins\\org.eclipse.core.commands_3.9.700.v20191217-1850.jar;"
//				+"\\plugins\\org.eclipse.core.contenttype_3.7.700.v20200517-1644.jar;"
//				+"\\plugins\\org.eclipse.core.databinding.observable_1.9.0.v20200205-2119.jar;"
//				+"\\plugins\\org.eclipse.core.expressions_3.6.800.v20200319-0911.jar;"
//				+"\\plugins\\org.eclipse.core.jobs_3.10.800.v20200421-0950.jar;"
//				+"\\plugins\\org.eclipse.core.resources_3.13.700.v20200209-1624.jar;"
//				+"\\plugins\\org.eclipse.core.runtime_3.18.0.v20200506-2143.jar;"
//				+"\\plugins\\org.eclipse.e4.core.contexts_1.8.400.v20191217-1710.jar;"
//				+"\\plugins\\org.eclipse.e4.ui.ide_3.15.100.v20200323-2111.jar;"
//				+"\\plugins\\org.eclipse.e4.ui.workbench3_0.15.400.v20191216-0805.jar;"
//				+"\\plugins\\org.eclipse.emf.common.ui_2.18.0.v20190507-0402.jar;"
//				+"\\plugins\\org.eclipse.emf.common_2.19.0.v20200324-0932.jar;"
//				+"\\plugins\\org.eclipse.emf.ecore.change_2.14.0.v20190528-0725.jar;"
//				+"\\plugins\\org.eclipse.emf.ecore.edit_2.13.0.v20190822-1451.jar;"
//				+"\\plugins\\org.eclipse.emf.ecore.xmi_2.16.0.v20190528-0725.jar;"
//				+"\\plugins\\org.eclipse.emf.ecore_2.22.0.v20200519-1135.jar;"
//				+"\\plugins\\org.eclipse.emf.edit_2.16.0.v20190920-0401.jar;"
//				+"\\plugins\\org.eclipse.equinox.app_1.4.500.v20200422-1833.jar;"
//				+"\\plugins\\org.eclipse.equinox.common_3.12.0.v20200504-1602.jar;"
//				+"\\plugins\\org.eclipse.equinox.preferences_3.8.0.v20200422-1833.jar;"
//				+"\\plugins\\org.eclipse.equinox.registry_3.8.800.v20200406-0956.jar;"
//				+"\\plugins\\org.eclipse.help_3.8.800.v20200525-0755.jar;"
//				+"\\plugins\\org.eclipse.jdt.core.manipulation_1.14.0.v20200526-0740.jar;"
//				+"\\plugins\\org.eclipse.jdt.core_3.22.0.v20200530-2032.jar;"
//				+"\\plugins\\org.eclipse.jdt.ui_3.21.100.v20200602-0959.jar;"
//				+"\\plugins\\org.eclipse.jface_3.20.0.v20200505-1952.jar;"
//				+"\\plugins\\org.eclipse.osgi.compatibility.state_1.1.800.v20200511-1223.jar;"
//				+"\\plugins\\org.eclipse.osgi.services_3.8.0.v20190206-2147.jar;"
//				+"\\plugins\\org.eclipse.osgi_3.15.300.v20200520-1959.jar;"
//				+"\\plugins\\org.eclipse.swt.win32.win32.x86_64_3.114.100.v20200604-0951.jar;"
//				+"\\plugins\\org.eclipse.swt_3.114.100.v20200604-0951.jar;"
//				+"\\plugins\\org.eclipse.ui.forms_3.9.100.v20200413-1417.jar;"
//				+"\\plugins\\org.eclipse.ui.ide_3.17.100.v20200530-0835.jar;"
//				+"\\plugins\\org.eclipse.ui.views_3.10.300.v20200311-1018.jar;"
//				+"\\plugins\\org.eclipse.ui.workbench_3.119.0.v20200521-1247.jar;"
//				+"\\plugins\\org.eclipse.ui_3.117.0.v20200518-1705.jar;"
//				+"\\plugins\\org.xixum.modeler.core.model_1.15.0.202307281404.jar"
//				+"\\plugins\\org.xixum.modeler.core.preferences_1.0.0.202307281404.jar"
//				+"\\plugins\\org.xixum.modeler.core_0.1.0.202307281404.jar"
//				+"\\plugins\\org.xixum.modeler.core.mmanip_1.3.0.202307281404.jar"
//				+"\\plugins\\org.xixum.modeler.core.model.design_0.0.1.202307281404.jar"
//				+"\\plugins\\org.xixum.modeler.core.model.edit_1.15.0.202307281404.jar"; 
		
		return pathList;
	}

}

