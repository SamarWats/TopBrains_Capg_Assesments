package com.cg.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.*;
import java.util.List;

public class DepartmentDemo {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("my-pu");

        EntityManager em = emf.createEntityManager();

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<DepartmentDTO> cq = cb.createQuery(DepartmentDTO.class);

        Root<Employee> root = cq.from(Employee.class);

        cq.select(cb.construct(DepartmentDTO.class,root.get("dept").get("dname"),cb.count(root)));
        cq.groupBy(root.get("dept").get("dname"));

        List<DepartmentDTO> result = em.createQuery(cq).getResultList();

        result.forEach(System.out::println);
    }
}


// earbuds kha gye? 