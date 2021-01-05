package com.djh.config;

import com.djh.bean.Color;
import com.djh.bean.Person;
import com.djh.bean.Red;
import com.djh.condition.LinuxCondition;
import com.djh.condition.WindowsCondition;
import javafx.stage.Window;
import org.springframework.context.annotation.*;
import sun.plugin2.os.windows.Windows;

/**
 * @Author AceDJH
 * @Date 2021/1/5 15:58
 */
@Conditional({WindowsCondition.class})
@Configuration
// 导入组件，id默认是组件的全类名
@Import({Color.class, Red.class})
public class MainConfig2 {
    @Bean("person")
    // @Scope(value = "prototype")
    @Lazy
    public Person person(){
        System.out.println("给容器中添加person");
        return new Person("段誉", 23);
    }

    // 如果系统是windows，给容器中注册bill
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person1(){
        // System.out.println("给容器中添加bill");
        return new Person("Bill Gates", 65);
    }
    // 如果系统是linux，给容器中注册linus
    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person2(){
        return new Person("linus", 50);
    }
}
