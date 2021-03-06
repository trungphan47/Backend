package com.demoyourself;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")// cái này làm j á | nó sẽ quét tất cả các @bean trong package com, khi config bằng annotationok. tức là bh á, còn làm abwngf XML thì không cần
public class PeopleConfig {

	@Bean
	public FortuneService happyFortune() {
		return new HappyFortune();
	}
	
	
//	Cái này là t đang muốn tạo 2 bean từ class student
//	bầy giờ làm 1 bean trước nên sẽ comment 2 cái này luôn: do nếu chỉ càn tạo 1 bean thì không cần cofig bên này
	
//	do tạo bean ở dây nên xóa @Component bên kia nhé
//	đay là 2 csi bean đưuọc 
	
	@Bean
	public People student() {
		Student trung =  new Student(happyFortune());
		trung.setName("Trung1");
		return trung;
	}
//	
	@Bean
	public People studentTrung() {
		Student trung =  new Student(happyFortune());
		trung.setName("Trung");
		return trung;
	}
//	sseer xem sao lại sai đã :v
}
