package weieyuan.com;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import weieyuan.util.DaoUtils;
import weieyuan.util.SpringUtils;

@Controller
public class TestController {

	@RequestMapping(value="welcome")
	public String welcome(Model m)
	{
		System.out.println("welcome");
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("data-source.xml");
//		
//		DaoUtils daoUtils = (DaoUtils) context.getBean("daoUtils");
		
		DaoUtils daoUtils = SpringUtils.getBeanByName("daoUtils");
		
		daoUtils.insert("shiling", "female", 13);
		
		return "welcome";
	}
	
//	@RequestMapping(value="spring.mvc.one/getData", method=RequestMethod.GET)
//	public void getData(@RequestParam("name") String aName, HttpServletRequest request, HttpServletResponse response)
//	{
//		System.out.println(aName);
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("application/json");
//		response.setHeader("Cache-Control", "no-cache");
//		PrintWriter p = null;
//		try
//		{
//			p = response.getWriter();
//			p.write("{response:success}");
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		finally
//		{
//			if(null != p)
//			{
//				p.close();
//			}
//		}
//	}
	
}
