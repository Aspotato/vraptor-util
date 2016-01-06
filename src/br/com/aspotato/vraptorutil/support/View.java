package br.com.aspotato.vraptorutil.support;

import br.com.aspotato.vraptorutil.config.VraptorUtilConfig;
import br.com.caelum.vraptor.Result;

public class View {

	public  static void make(Result result, String path) throws Exception{
		VraptorUtilConfig vraptorUtilConfig = VraptorUtilConfig.getInstance();

		if(path != null && path.length()>2){

			if( path.substring(path.length() - 3).equals("jsp")){
				result.forwardTo(vraptorUtilConfig.getViewDir()+path);
			}else{

				if(path.contains("/")){
					result.forwardTo(vraptorUtilConfig.getViewDir()+path+".jsp");
				}else{
					path = path.replaceAll("\\.", "/");
					result.forwardTo(vraptorUtilConfig.getViewDir()+path+".jsp");
				}

			}

		}else{
			throw new Exception("Invalid Path");
		}

	}


	public  static void make(Result result, String path, String viewDir) throws Exception{

		if(path != null && path.length()>2){

			if( path.substring(path.length() - 3).equals("jsp")){
				result.forwardTo(viewDir+path);
			}else{

				if(path.contains("/")){
					result.forwardTo(viewDir+path+".jsp");
				}else{
					path = path.replaceAll("\\.", "/");
					result.forwardTo(viewDir+path+".jsp");
				}

			}

		}else{
			throw new Exception("Invalid Path");
		}

	}

















}