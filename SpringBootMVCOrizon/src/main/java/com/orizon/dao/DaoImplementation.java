package com.orizon.dao;


import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.orizon.model.Car;


@Repository
public class DaoImplementation implements Dao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Car> getCars() {
		
		Session session=entityManager.unwrap(Session.class);
		List<Car> cars=session.createQuery("from Car", Car.class).getResultList();
		return cars;
	}

	@Override
	public Car findCar(int carId) {
		Session session=entityManager.unwrap(Session.class);
		return session.get(Car.class, carId);
	}
	
	@Override
	public void save(Car car) {
		
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(car);
		
	}


	@Override
	public void deleteCar(int carId) {
		
		Session session = entityManager.unwrap(Session.class);
		session.createQuery("delete from Car where id=:id").setParameter("id", carId).executeUpdate();
	}

	

	@Override
	public List<Car> findCarByColor(String color) {

		Session session = entityManager.unwrap(Session.class);
		List <Car> cars = session.createQuery("FROM Car e WHERE e.color = :color").setParameter("color", color).getResultList();
		
		return cars;
	}

	@Override
	public List<Car> findCarByModel(String model1) {
		Session session = entityManager.unwrap(Session.class);
		List <Car> cars = session.createQuery("FROM Car e WHERE e.model = :model").setParameter("model", model1).getResultList();
		
		return cars;
	}

	@Override
	public List<Car> findCarByYearOfPurchase(String yop) {
		Session session = entityManager.unwrap(Session.class);
		List <Car> cars = session.createQuery("FROM Car e WHERE e.date_of_purchase LIKE :yop").setParameter("yop", "%"+yop+"%").getResultList();
		return cars;
	}

	@Override
	public List<Car> findCarByPriceRange(double price) {
		Session session = entityManager.unwrap(Session.class);
		List <Car> cars = session.createQuery("FROM Car e WHERE e.price = :price").setParameter("price", price).getResultList();
		return cars;
	}

}
