package edu.icet.pos.util;

import edu.icet.pos.dto.Employee;
import edu.icet.pos.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory session = createSession();

    private static SessionFactory createSession(){
        StandardServiceRegistry build = new StandardServiceRegistryBuilder().
                configure("hibernate.cfg.xml").
                build();

        Metadata metaData = new MetadataSources(build)
                .addAnnotatedClass(UserEntity.class)
                .addAnnotatedClass(EmployeeEntity.class)
                .addAnnotatedClass(OrderEntity.class)
                .addAnnotatedClass(ProductEntity.class)
                .addAnnotatedClass(SupplierEntity.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        return metaData.getSessionFactoryBuilder().build();
    }

    public static Session getSession(){
        return session.openSession();
    }
}
