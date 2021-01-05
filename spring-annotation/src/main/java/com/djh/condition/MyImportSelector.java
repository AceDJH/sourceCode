package com.djh.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author AceDJH
 * @Date 2021/1/5 17:33
 */
public class MyImportSelector implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link Configuration} class.
     *
     * @param importingClassMetadata
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.djh.bean.Blue", "com.djh.bean.Yellow"};
    }
}
