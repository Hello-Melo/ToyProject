package hoon.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan("hoon.mapper")
public class RootConfig {
	
	/*
	 * @Bean public DataSource dataSource() { HikariConfig config = new
	 * HikariConfig();
	 * config.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
	 * config.setJdbcUrl("jdbc:log4jdbc:mysql://localhost/project_ex");
	 * config.setUsername("root"); config.setPassword("1234"); return new
	 * HikariDataSource(config); }
	 * 
	 * @Bean public SqlSessionFactory sessionFactory() throws Exception {
	 * SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
	 * bean.setDataSource(dataSource()); return bean.getObject(); }
	 */
}
