//package spring_revision_interview_prep.interview_prep.transactionalImpl.propagation.programmaticApproach2;

//***************************************************
// using AppConfig.java from the propagation Parent package
//***************************************************

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.TransactionDefinition;
//import org.springframework.transaction.support.TransactionTemplate;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class TemplateConfig {
//    @Bean
//    public DataSource dataSource2(){
//        DriverManagerDataSource dataSource2 = new DriverManagerDataSource();
//        dataSource2.setUrl("jdbc:h2:mem:testdb");
//        dataSource2.setUsername("smk");
//        dataSource2.setPassword("");
//        return dataSource2;
//    }
//
//    @Bean
//    public PlatformTransactionManager userTransactionManager2(DataSource dataSource2){
//        return new DataSourceTransactionManager(dataSource2);
//    }
//    @Bean
//    public TransactionTemplate transactionTemplate(PlatformTransactionManager userTransactionManager2){
//        TransactionTemplate transactionTemplate = new TransactionTemplate(userTransactionManager2);
//        transactionTemplate.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
//        transactionTemplate.setName("Testing -> Propagation REQUIRED USING TRANSACTION TEMPLATE");
//        return transactionTemplate;
//    }
//}
