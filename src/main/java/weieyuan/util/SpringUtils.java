package weieyuan.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtils implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		SpringUtils.applicationContext = arg0;

	}

	public static ApplicationContext getApplicationContext() 
	{
		checkApplicationContext();
		return applicationContext;
	}
	
	@SuppressWarnings("unchecked")
	public static <T>  T getBeanByName(String name)
	{
		checkApplicationContext();
		return (T) applicationContext.getBean(name);
	}

	private static void checkApplicationContext() 
	{
		if (applicationContext == null) 
		{
			throw new IllegalStateException("ApplicationContext没有被注入..");
		}
	}
	
}
