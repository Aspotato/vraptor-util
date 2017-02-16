package br.com.aspotato.vraptorutil.config;

public class VraptorUtilConfig {

	private static VraptorUtilConfig instance;
	
	private String viewDir = "/WEB-INF/jsp/";
	
	private String pageNotFoundPath = "default/pagenotfound/pagenotfound.jsp";
	
	private VraptorUtilConfig() {

	}

	public static VraptorUtilConfig getInstance() {
		if (instance == null)
			instance = new VraptorUtilConfig();
		return instance;
	}

	public String getViewDir() {
	    return viewDir;
    }

	public void setViewDir(String viewDir) {
	    this.viewDir = viewDir;
    }

	public String getPageNotFoundPath() {
	    return pageNotFoundPath;
    }

	public void setPageNotFoundPath(String pageNotFoundPath) {
	    this.pageNotFoundPath = pageNotFoundPath;
    }
}
