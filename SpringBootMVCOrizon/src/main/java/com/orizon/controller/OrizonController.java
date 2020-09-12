package com.orizon.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.orizon.model.Car;
import com.orizon.service.AppService;





@Controller
@RequestMapping("/")
public class OrizonController {


	@Autowired
	private AppService appService;

	@RequestMapping("/")
	public String homePage() {

		return "home";
	}

	@RequestMapping("/feature")
	public String featuresPage(Model model) {

		List<Car> cars=appService.getCars();
		model.addAttribute("cars", cars);

		return "feature";
	}

	@RequestMapping("/addCar")
	public String addCarPageDisplay(Model model) {

		model.addAttribute("car", new Car());

		return "addCar";
	}

	@RequestMapping("/addCarSuccess")
	public String addCarSuccess(@ModelAttribute("car") Car car) {

		appService.save(car);	

		return "redirect:/feature";

	}


	@RequestMapping("/updateForm")
	public String updateForm(@RequestParam("updateId") String id,Model model) {

		int carId=Integer.parseInt(id);

		Car car=appService.findCar(carId);

		model.addAttribute("car", car);

		return "addCar";
	}


	@RequestMapping("/deleteForm")
	public String deleteForm(@RequestParam("deleteId") String id, Model model) {

		int carId=Integer.parseInt(id);

		appService.deleteCar(carId);

		return "redirect:/feature";

	}

	@RequestMapping("/searchCar")
	public String searchCarPage(Model model) {

		model.addAttribute("car", new Car());

		return "search";
	}


	@RequestMapping("/processForm")
	public String processForm(@RequestParam("color") String color,
			@RequestParam("model1") String model1,
			@RequestParam("yop") String yop,
			@RequestParam("price") String price,
			
			Model model) {
	
		if(!(color.isEmpty())) {

			List<Car> searchedCars=appService.findCarByColor(color);

			model.addAttribute("car", searchedCars);
			
			return "searchSuccess";
		}
		
		
		else if(!(model1.isEmpty())) {
			
			List<Car> searchedCars=appService.findCarByModel(model1);

			model.addAttribute("car", searchedCars);
			
			return "searchSuccess";
		}
		
		else if(!(yop.isEmpty())) {

			List<Car> searchedCars=appService.findCarByYearOfPurchase(yop);

			model.addAttribute("car", searchedCars);
			
			return "searchSuccess";
		}
		
		else if(!(price.isEmpty())) {
			
			List<Car> searchedCars=appService.findCarByPriceRange(Double.valueOf(price));

			model.addAttribute("car", searchedCars);
			
			return "searchSuccess";
		}

		return "searchSuccess";
	}









}
