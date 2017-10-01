package fisioBack.configuration;

import javax.security.auth.login.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

//	public void onStartup(ServletContext container) throws ServletException {
//
//		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//		ctx.register(Configuracion.class);
//		ctx.setServletContext(container);
//
//		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
//
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/");
//	}
//	
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[] { Configuracion.class };
//    }
//  
//    protected Class<?>[] getServletConfigClasses() {
//        return null;
//    }
//  
//    protected String[] getServletMappings() {
//        return new String[] { "/" };
//    }
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { Configuration.class };
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
 
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}