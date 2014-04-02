/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 *
 * @author oper4
 */
public class Springdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new GenericApplicationContext();
        
        
        new XmlBeanDefinitionReader((BeanDefinitionRegistry)ctx).loadBeanDefinitions(new String[] {"config.xml"});

        ctx.refresh();
        EntityClass o = (EntityClass) ctx.getBean("myentity");
        o.inform();
    }
}
