package com.srin.spring;

import javax.inject.Provider;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Singleton {
	
	@Autowired
	private Prototype prototype; 
	
//	@Autowired
//	ObjectFactory<Prototype> protoObjectFactory;
//	
//	@Autowired
//	Provider<Prototype> protoProvider;
	
	public Singleton() {
		System.out.println("Singleton bean instantiated: "+ this);
	}
	
	public Prototype getPrototype() {
//		// Application Context
//		prototype = BeanUtil.getBean(Prototype.class);
//		
//		// Object Factory
//		prototype = protoObjectFactory.getObject();
//		
//		//Provider
//		prototype = protoProvider.get();
//		
//		// Lookup method injection
//		prototype = lookupProto();
				
		System.out.println("In getPrototype. Returning: "+ prototype);
		return prototype;
	}
	
//	@Lookup
//	public Prototype lookupProto() {
//		return null;
//	}

}

