package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Service
public class MyService  {

    private MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Transactional
    public void doBusinessLogic() {
        System.out.println("Doing some business logic for : " );

        myRepository.doQuery();
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set!");
    }

 /*   @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean!!");
    }*/
}
