package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.model.Review;

@RestController
public class Lesson03Ex02RestController {

	
	@Autowired
	private ReviewBO reivewBO;
	
	// 요청 URL: http://localhost:8080/lesson03/ex02
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		Review review = new Review();  // 일반 자바 bean
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("김수빈");
		review.setPoint(4.5);
		review.setReview("혼자 먹기 딱 적당하네요.");
		
		int rowCount = reivewBO.addReview(review);
		return "success row count:" + rowCount;
	}
}
