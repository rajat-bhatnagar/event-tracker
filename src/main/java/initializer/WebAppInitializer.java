package initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/*
 * This class implements WebApplicationInitalizer 
 * to specify and location and constuct the configuration details
 * like the context , dispatcherServlet and mapping
 */
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext context = getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcherServlet = 
				servletContext.addServlet("dispatcherServlet", new DispatcherServlet(context));
		dispatcherServlet.setLoadOnStartup(1);
		dispatcherServlet.addMapping("*.html");
	}

	private WebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.thoughtworks.coding.configuration.WebConfig");
		return context;
	}

}
