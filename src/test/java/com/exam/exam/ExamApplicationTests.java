package com.exam.exam;

import com.exam.exam.Entitys.OrffreEmploi;
import com.exam.exam.Entitys.Specialite;
import com.exam.exam.Reposetories.OrffreEmploiRepository;
import com.exam.exam.Reposetories.SpecialiteRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExamApplicationTests {
	@Autowired
	SpecialiteRepository specialiteRepository;
	@Autowired
	OrffreEmploiRepository   orffreEmploiRepository;
	
	@Test
	void contextLoads() {
	}
	@Test void Seed(){

		Specialite s = new Specialite("informatique");
	
		specialiteRepository.save(s);
		Specialite s1 = new Specialite("service");
		 specialiteRepository.save(s1);
		Specialite s2 = new Specialite("culture");
		 specialiteRepository.save(s2);
		 Specialite s3 = new Specialite("agriculture");
		specialiteRepository.save(s3);
		Specialite s4 = new Specialite("éducation");
		specialiteRepository.save(s4);


		OrffreEmploi o = new OrffreEmploi("ingénieur",s,"TAS","TN",10,"Avalibal");
		orffreEmploiRepository.save(o);


		





	}

}
