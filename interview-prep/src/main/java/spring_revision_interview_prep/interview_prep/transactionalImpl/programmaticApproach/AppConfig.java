package spring_revision_interview_prep.interview_prep.transactionalImpl.programmaticApproach;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

@Configuration //creating a custom Bean
public class AppConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("org.h2.Driver");
        datasource.setUrl("jdbc:h2:mem:testdb");
        datasource.setUsername("smk");
        datasource.setPassword("");
        return datasource;

    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public TransactionTemplate transactionManagerImpl(PlatformTransactionManager transactionManager){
        return new TransactionTemplate(transactionManager);
    }
    @Bean
    public TransactionTemplate transactionTemplate(PlatformTransactionManager userTransactionManager2){
        TransactionTemplate transactionTemplate = new TransactionTemplate(userTransactionManager2);
        transactionTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        transactionTemplate.setName("Testing -> Propagation REQUIRED USING TRANSACTION TEMPLATE");
        return transactionTemplate;
    }

}
