package org.kishan;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle implements InitializingBean, DisposableBean
//public class Triangle
{
	private Point pointa; 
	private Point pointb;
	private Point pointc;
	private ApplicationContext context;

	public Point getPointa() 
	{
		return pointa;
	}

	public void setPointa(Point pointa)
	{
		this.pointa = pointa;
	}

	public Point getPointb() 
	{
		return pointb;
	}


	public void setPointb(Point pointb) 
	{
		this.pointb = pointb;
	}

	public Point getPointc()
	{
		return pointc;
	}

	public void setPointc(Point pointc)
	{
		this.pointc = pointc;
	}
	
	public void draw()
	{
		System.out.println("Triangle draw");
		System.out.println(" PointA : "+"(" +pointa.getX() +","+ pointa.getY() + ")");
		System.out.println(" PointB : "+"(" +pointb.getX() +","+ pointb.getY() + ")");
		System.out.println(" PointC : "+"(" +pointc.getX() +","+ pointc.getY() + ")");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialising Bean Init Method called");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Bean Method called");		
	}

	/*@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanName) {
System.out.println("bean name is  : "+beanName);		
	}*/
	
	public void myInit()
	{
		System.out.println("Init method");
	}
	
	public void destroyMethod()
	{
		System.out.println("Destroy Method");
	}
}
