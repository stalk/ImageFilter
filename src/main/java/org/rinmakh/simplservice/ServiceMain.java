package org.rinmakh.simplservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author Rinat_Makhmutov
 */

@Configuration
@ComponentScan
public class ServiceMain {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(ServiceMain.class);

        HashSet<String> set = new HashSet<String>();
        Hashtable<String,String> t = new Hashtable<String, String>();

        HashMap<String, String> t2 = new HashMap<String, String>();

    }
}
