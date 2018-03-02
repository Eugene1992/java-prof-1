package com.cbs.edu.hello_world_annotations.config;

import com.cbs.edu.hello_world_annotations.ConsoleMessageRenderer;
import com.cbs.edu.hello_world_annotations.HelloWorldMessageProvider;
import com.cbs.edu.hello_world_annotations.MessageProvider;
import com.cbs.edu.hello_world_annotations.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(@Autowired MessageProvider messageProvider) {
        return new ConsoleMessageRenderer(messageProvider);
    }
}
