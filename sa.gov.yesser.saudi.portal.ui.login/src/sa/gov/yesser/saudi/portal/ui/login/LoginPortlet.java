package sa.gov.yesser.saudi.portal.ui.login;

import java.io.*;
import javax.portlet.*;

/**
 * A sample portlet based on GenericPortlet
 */
public class LoginPortlet extends GenericPortlet {

	public static final String HTML_FOLDER    = "/artifacts/";    // HTML folder name

	public static final String VIEW_HTML      = "LoginPortletView";         // HTML file name to be rendered on the view mode
 
	/**
	 * @see javax.portlet.Portlet#init()
	 */
	public void init() throws PortletException{
		super.init();
	}

	/**
	 * Serve up the <code>view</code> mode.
	 * 
	 * @see javax.portlet.GenericPortlet#doView(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {

		// Set the MIME type for the render response
		response.setContentType(request.getResponseContentType());

		// Invoke the HTML to render
		PortletRequestDispatcher rd = getPortletContext().getRequestDispatcher(getHtmlFilePath(request, VIEW_HTML));
		rd.include(request,response);
	}

	/**
	 * Process an action request.
	 * 
	 * @see javax.portlet.Portlet#processAction(javax.portlet.ActionRequest, javax.portlet.ActionResponse)
	 */
	public void processAction(ActionRequest request, ActionResponse response) throws PortletException, java.io.IOException {

    }
    
    
    /**
	 * Process a serve Resource request.
	 * 
	 * @see javax.portlet.Portlet#serveResource(javax.portlet.ResourceRequest, javax.portlet.ResourceResponse)
	 */
	public void serveResource(ResourceRequest request, ResourceResponse response) throws PortletException, java.io.IOException {
		String resourceID = request.getResourceID();
		if (resourceID.equals("resourceID")) {
			// Insert code for serving the resource 
		}
	}
    
	/**
	 * Returns HTML file path.
	 * 
	 * @param request Render request
	 * @param htmlFile HTML file name
	 * @return HTML file path
	 */
	private static String getHtmlFilePath(RenderRequest request, String htmlFile) {
		String markup = request.getProperty("wps.markup");
		if( markup == null )
			markup = getMarkup(request.getResponseContentType());
		return HTML_FOLDER + markup + "/" + htmlFile + "." + getHtmlExtension(markup);
	}

	/**
	 * Convert MIME type to markup name.
	 * 
	 * @param contentType MIME type
	 * @return Markup name
	 */
	private static String getMarkup(String contentType) {
		if( "text/vnd.wap.wml".equals(contentType) )
			return "wml";
        else
            return "html";
	}

	/**
	 * Returns the file extension for the HTML file
	 * 
	 * @param markupName Markup name
	 * @return HTML extension
	 */
	private static String getHtmlExtension(String markupName) {
		return "html";
	}


}
