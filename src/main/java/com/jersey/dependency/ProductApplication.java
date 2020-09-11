package com.jersey.dependency;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
@ApplicationPath("/product")
public class ProductApplication extends Application{
	Set<Object> singletons;
	Set<Class<?>> classes;
	//constructor
	
	public ProductApplication() {
		singletons= new HashSet<>();
		singletons.add(new Application());
		
		classes=new HashSet<>();
		classes.add(Product.class);
	}
	
	public Set<Object> geSingletons(){
		return singletons;
	}
	public Set<Class<?>> getClasses(){
		return classes;
	}
}
