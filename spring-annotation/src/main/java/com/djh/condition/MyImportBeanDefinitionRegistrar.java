package com.djh.condition;

import com.djh.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author AceDJH
 * @Date 2021/1/5 17:57
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * Register bean definitions as necessary based on the given annotation metadata of
     * the importing {@code @Configuration} class.
     * <p>Note that {@link BeanDefinitionRegistryPostProcessor} types may <em>not</em> be
     * registered here, due to lifecycle constraints related to {@code @Configuration}
     * class processing.
     *
     * @param importingClassMetadata annotation metadata of the importing class
     * @param registry               current bean definition registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.djh.bean.Red");
        boolean blue = registry.containsBeanDefinition("com.djh.bean.Blue");
        if (red && blue){
            // 指定Bean定义信息
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            // 指定bean名
            registry.registerBeanDefinition("rainBow", rootBeanDefinition);
        }

    }
}
