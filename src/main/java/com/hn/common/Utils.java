package com.hn.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class Utils {


    
    public static void LoadConfig(String filename) throws Exception {
        Properties props = System.getProperties();
        InputStream fis = new FileInputStream(filename);
        props.load(fis);
        System.setProperties(props);
        fis.close();
        
    }

    /**
     * system init load config
     * @throws Exception
     */
    public static void initLoad() throws Exception {

        String configPath = System.getProperty("config.dir") + File.separatorChar + "config.cfg";
        System.out.println(System.getProperty("config.dir"));
        
        Utils.LoadConfig(configPath);   
        /*
        
        // log init load        
        String dataPath = System.getProperty("logsDir");
        if(!dataPath.endsWith(String.valueOf(File.separatorChar))){
            dataPath = dataPath + File.separatorChar;
        }
        String logDir = dataPath + "logs" + File.separatorChar;
        System.out.println("logdir:" + logDir);
        System.setProperty("log.dir", logDir);
        System.setProperty("log.info.file", "info_sync.log");
        System.setProperty("log.debug.file", "error_sync.log");
        PropertyConfigurator.configure(System.getProperty("config.dir") + File.separatorChar + "log4j.properties");
        */
    }
}
