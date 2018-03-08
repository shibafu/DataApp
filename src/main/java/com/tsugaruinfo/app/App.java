package com.tsugaruinfo.app;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

import model.Mypersonaldata;

@Component
@ComponentScan("com.tsugaruinfo.config")
public class App {
	//private static JdbcTemplate jdbcTemplate;
	private static ApplicationContext context;
	private static EntityManager manager;
	
	
	
	public static void main(String args[]) {
		
		//アノテーションを用いたテンプレートの作成
		//context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
		//JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean(JdbcTemplate.class);
		//コンテキスト取得
//		context = new ClassPathXmlApplicationContext("bean.xml");
//		jdbcTemplate = context.getBean(JdbcTemplate.class);
	
		context = new ClassPathXmlApplicationContext("bean.xml");
		
		LocalContainerEntityManagerFactoryBean factory =
				context.getBean(LocalContainerEntityManagerFactoryBean.class);
		manager = factory.getNativeEntityManagerFactory().createEntityManager();
		
		Mypersonaldata data = manager.find(Mypersonaldata.class, 1);
		
			System.out.println(data);
	
	}

}
