package org.stuff;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bena, String beanName)
			throws BeansException {
		System.out.println("In after initialization method. Bean name is"
				+ beanName);
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In before initialization method. Bean name is"
				+ beanName);
		return null;
	}

}
