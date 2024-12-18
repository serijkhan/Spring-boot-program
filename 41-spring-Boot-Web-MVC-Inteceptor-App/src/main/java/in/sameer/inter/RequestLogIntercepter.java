package in.sameer.inter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestLogIntercepter implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("PreHandle() methods call...");
		
		long startTime = System.currentTimeMillis();
		
		request.setAttribute("startTime",startTime);
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("PostHandler() methods call...");
		
		long endTime = System.currentTimeMillis();
		
		long startTime = (long) request.getAttribute("startTime");
		
		long time = endTime - startTime;
		
		System.out.println("Total time taken" + time);
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	
	
	

}
