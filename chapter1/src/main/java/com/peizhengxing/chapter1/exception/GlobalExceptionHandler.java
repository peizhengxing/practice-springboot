package com.peizhengxing.chapter1.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.peizhengxing.chapter1.dto.ErrorInfo;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final String DEFAULT_ERROR_VIEW = "error";

	@ExceptionHandler(value=Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", e);
		mav.addObject("url", req.getRequestURL());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		return mav;
	}
	
	@ExceptionHandler(value=MyException.class)
	@ResponseBody
	public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req,MyException e) throws Exception{
	    ErrorInfo<String> error = new ErrorInfo<>();
	    error.setCode(ErrorInfo.ERROR);
	    error.setMessage(e.getMessage());
	    error.setUrl(req.getRequestURL().toString());
	    error.setData("custome data");
		return error;	
	}
}
