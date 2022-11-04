package com.tcm.spring.security.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import javax.sql.PooledConnection;
import java.beans.PropertyVetoException;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


@Configuration
@ComponentScan(basePackages = "com.tcm.spring.security")
@EnableWebMvc

public class MyConfig {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver =
                new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

//    @Bean
//    public DataSource() throws SQLException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//
//        String USER_NAME = "root";
//        String PASSWORD = "zhbfszhdgDF%@#%#qSPOKFGPOFG";
//        String URl = "jdbc:mysql://localhost:3306/mysql";
//        Statement statement;
//        Connection connection;
//
//
//        try {
//            connection = DriverManager.getConnection(URl, USER_NAME, PASSWORD);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//        try{
//            statement = (Statement) connection.createStatement();
//        }catch (SQLException e){
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//
////        String url = "jdbc:mysql://localhost:3306/users";
////        String user = "root";
////        String password = "zhbfszhdgDF%@#%#qSPOKFGPOFG";
//
//        try {
//            dataSource.setDriverClass("org.mysql.Driver"); //loads the jdbc driver
//            dataSource.setJdbcUrl("jdbc:postgresql://localhost:3306/users");
//            dataSource.setUser("swaldman");
//            dataSource.setPassword("test-password");
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//    }


}
