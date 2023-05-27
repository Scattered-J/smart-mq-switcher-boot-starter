package config;

import MqAdapterFactory.MqAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;



/**
 * @Author: HuZeXuan
 * @Date: 2023/04/04/17:06
 */
@Configuration
@ComponentScan
public class SmartMqSwitcherConfiguration {

    @Value("${binders-mq-type}")
    private String rabbitType;




}
