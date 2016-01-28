package com.hn.netty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;


import com.hn.common.Utils;

public class ServerUp {

    public static void main(String[] args) throws Exception {
        Utils.initLoad();
        System.out.println("--------");
        
        
     // 初始化Logback
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(lc);
        lc.reset();
        configurator.doConfigure(System.getProperty("config.dir") + "/logback_Server.xml");
        final Logger log = LoggerFactory.getLogger("RocketmqNamesrv");
        
        log.info("{}, consuming time total(ms): " , ServerUp.class.getName());
    }

    
}