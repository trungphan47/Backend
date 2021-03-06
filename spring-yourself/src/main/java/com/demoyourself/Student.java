package com.demoyourself;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//add Component
//@Component
public class Student implements People {
	private String name;

//	C1
	// @Autowired
	private FortuneService fortuneService;

//	C2
	//@Autowired
	public Student(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
//	cái này thì không cần @Autowrite củng được

	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

//	C3
//	 @Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

//	tạo xong2 cái bean rồi đó
//	1 cái là HappyFortune
//	và 1 cái là student

//	xong bước tạo bean.ok chưa
//	mỗi cái @COMPONENT LÀ 1 CÁI BEAN: tên(id) của nó mặc định là tên classs nhưng viết thường chử đầu tiền

//	bây giờ sẽ dependence injection
//	dối với cách 1 này sẽ có 3 cách để tạo DI
//	chỉ cần xào 1 trong 3 là được

//	C2: tạo bean xong rồi. ok chưa
//	DI nè
//	cái này thì sẽ dùng DI theo C1
//	còn nếu muốn DI bằng constructor thì phải tạo cái bean của HappyFortune bên class config 

}
