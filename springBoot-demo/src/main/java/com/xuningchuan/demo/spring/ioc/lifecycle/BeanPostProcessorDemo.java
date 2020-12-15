package com.xuningchuan.demo.spring.ioc.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author xuningchuan
 * @Title: BeanPostProcessorDemo bean 处理器 对所有的bean 都生效
 * @Description:
 * @date 2019/12/8下午7:00
 */
@Component
@Slf4j
public class BeanPostProcessorDemo implements InstantiationAwareBeanPostProcessor, BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("chinesePerson".equals(beanName))
        log.info("=====调用 BeanPostProcessor.postProcessBeforeInitialization,bean[{}],beanName[{}]", bean.getClass().getSimpleName(), beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("chinesePerson".equals(beanName))
        log.info("=====调用 BeanPostProcessor.postProcessAfterInitialization,bean[{}],beanName[{}]", bean.getClass().getSimpleName(), beanName);
        return bean;
    }



    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if("chinesePerson".equals(beanName))
         log.info("=====调用 InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation,beanName[{}]", beanName);
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if("chinesePerson".equals(beanName))
         log.info("=====调用 InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation,beanName[{}]", beanName);
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
        if("chinesePerson".equals(beanName))
            log.info("=====调用 InstantiationAwareBeanPostProcessor.postProcessPropertyValues,beanName[{}]", beanName);
        return pvs;
    }
}
