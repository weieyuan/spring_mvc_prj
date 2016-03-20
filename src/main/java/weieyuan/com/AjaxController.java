package weieyuan.com;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import weieyuan.vo.TestPostInputVo;
import weieyuan.vo.TestPostOutputVo;

@Controller
@RequestMapping(value="/getData")
public class AjaxController {
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public void getData(@RequestParam("name") String aName, HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println(aName);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "no-cache");
		PrintWriter p = null;
		try
		{
			p = response.getWriter();
			p.write("{response:success}");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(null != p)
			{
				p.close();
			}
		}
		
	}
	
	@ResponseBody
	@RequestMapping(value="/post", method=RequestMethod.POST)
	public Map<String, Object> testPost(@RequestBody TestPostInputVo oTestPostInputVo, HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println(oTestPostInputVo.getName());
		System.out.println(oTestPostInputVo.getAddr());
		System.out.println(oTestPostInputVo.getAge());
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("me", "good");
		map.put("shiling", "good");
		
		return map;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/post/object", method=RequestMethod.POST)
	public TestPostOutputVo testPost4Object(@RequestBody TestPostInputVo oTestPostInputVo, HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println(oTestPostInputVo.getName());
		System.out.println(oTestPostInputVo.getAddr());
		System.out.println(oTestPostInputVo.getAge());
		
		TestPostOutputVo oTestPostOutputVo = new TestPostOutputVo();
		
		oTestPostOutputVo.setName("shiling");
		oTestPostOutputVo.setSex("female");
		oTestPostOutputVo.setAge(18);
		
		return oTestPostOutputVo;
		
	}

}
