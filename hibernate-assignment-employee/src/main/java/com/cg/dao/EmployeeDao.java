package com.cg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.entity.Employee;
import com.cg.util.HibernateUtil;

public class EmployeeDao {

    // Insert
    public void addEmployee(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(emp);

        tx.commit();
        session.close();
    }

    // Get by ID
    public Employee getEmployee(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Employee emp = session.get(Employee.class, id);
        session.close();
        return emp;
    }

    // Update
    public void updateEmployee(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.update(emp);

        tx.commit();
        session.close();
    }

    // Delete
    public void deleteEmployee(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = session.get(Employee.class, id);
        if (emp != null) {
            session.delete(emp);
        }

        tx.commit();
        session.close();
    }

    // Display All
    public List<Employee> getAllEmployees() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Employee> list = session.createQuery("from Employee", Employee.class).list();
        session.close();
        return list;
    }
}