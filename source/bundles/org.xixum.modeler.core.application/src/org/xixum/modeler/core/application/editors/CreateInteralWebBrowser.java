package org.xixum.modeler.core.application.editors;

import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;

import java.net.URL;

public class CreateInteralWebBrowser {
    public static void openHtmlFile(String filePath) {
        try {
            // Get the Workbench Browser Support
            IWorkbenchBrowserSupport browserSupport = PlatformUI.getWorkbench().getBrowserSupport();

            // Create an internal browser instance
            IWebBrowser browser = browserSupport.createBrowser(
                    IWorkbenchBrowserSupport.AS_EDITOR | IWorkbenchBrowserSupport.LOCATION_BAR, 
                    null, 
                    null, 
                    null
                );

            // Open the file in the browser
            browser.openURL(new URL("file://" + filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
