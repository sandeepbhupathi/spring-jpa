package com.sandeep.repo;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sandeep.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

/*	@Query(value="SELECT m FROM User m WHERE (SELECT COUNT(e) "
  + "FROM User e WHERE e.id = m) > 0")
	Page<Object> findAllDist(Pageable page);*/
	
	
	@Query(value="SELECT  m.name,a.zip FROM User m join m.addreass a group by m.name,a.zip")
	Page<Object> findAllDist(Pageable page);
	
	
	@SuppressWarnings("unchecked")
	default List<Object> findPageData(EntityManager em,Pageable page){
		return em.createQuery("SELECT  distinct m.name,a.zip FROM User m "
				+ "join m.addreass a order by m.name,a.zip").
				setFirstResult(page.getPageNumber()*page.getPageSize()).
		setMaxResults(page.getPageSize()).getResultList();
	}

	@Query(value="select count(*) from (select distinct a.name,b.zip  from user_sa a inner join address_sa b on a.id=b.id)",nativeQuery=true)
	long findPageCount();
}
