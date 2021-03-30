package com.xuningchuan.demo.spring.ioc.lifecycle;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.PropertyDescriptor;

/**
 * @author xuningchuan
 * @Title: ChinesePerson
 * @Description:
 * @date 2019/12/8下午6:49
 */
@Component
@Slf4j
@AllArgsConstructor
public class ChinesePerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {



    /* bean 生命周期顺序

       postProcessBeanFactory
       Instantiate before  postProcessBeforeInstantiation
       Instantiate
       Instantiate after   postProcessAfterInstantiation
       set filed
       setBeanName
       setBeanFactory
       setApplicationContext
       init before     postProcessBeforeInitialization
       init @PostConstruct
       init after       postProcessAfterPropertiesSet
       running
       preDestroy @PreDestroy
       destroy


       实例化bean-->设置属性值-->初始化bean-->销毁bean

     */

    /**
     *  私有属性
     */
    public Animal animal;


    /**
     *  无参构造器
     */
    public ChinesePerson() {
        log.info("=====实例化bean[{}]", this.getClass().getSimpleName());
    }

    /**
     *  DI 注入
     * @param dog
     */
    @Autowired //根据类型获取bean
    public void setAnimal(Animal dog) {
        this.animal = dog;
        log.info("=====设置属性值,注入依赖[{}]", animal.getClass().getSimpleName());
    }

    @Override
    public void setBeanName(String name) {
      log.info("=====[{}]调用BeanNameAware.setBeanName 方法 name[{}]", this.getClass().getSimpleName(), name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("=====[{}]调用BeanFactoryAware.setBeanFactory 方法", this.getClass().getSimpleName());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("=====[{}]调用ApplicationContextAware.setApplicationContext 方法", this.getClass().getSimpleName());
    }

    @PostConstruct
    public void init(){
        log.info("=====[{}]调用@PostConstruct修饰的方法", this.getClass().getSimpleName());
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("=====[{}]调用InitializingBean.afterPropertiesSet", this.getClass().getSimpleName());
    }


    @Override
    public void animalService() {
        animal.used();
    }


    @PreDestroy
    public void preDestroy(){
        log.info("=====[{}]调用@PreDestroy修饰的方法", this.getClass().getSimpleName());
    }

    @Override
    public void destroy() throws Exception {
        log.info("=====[{}]调用DisposableBean.destroy的方法", this.getClass().getSimpleName());

    }
}
