package com.geocan.libros.libros.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.geocan.libros.libros.model.Book;

@RestController

public class BookbuddiesController {

	
	@RequestMapping( method = RequestMethod.GET, value="/books")
	public ResponseEntity<List<Book>> home(){
//		Map model = new HashMap();
//		model.put("content", getListOfBooks());
		return new ResponseEntity<List<Book>>( getListOfBooks(), HttpStatus.OK);
	}
	
	@GetMapping("/algo")
	public String algo(){
		return "algo";
	}
	
	
	
	private List<Book> getListOfBooks(){
		Book book1 = new Book("Chinua Achebe", "Nigeria",
				"https://upload.wikimedia.org/wikipedia/en/6/65/ThingsFallApart.jpg", "English",
				"https://en.wikipedia.org/wiki/Things_Fall_Apart",  "Things Fall Apart");

		
		Book book2 = new Book("Hans Christian Andersen", "Denmark",
				"https://upload.wikimedia.org/wikipedia/commons/5/5b/Hans_Christian_Andersen_%281834_painting%29.jpg", "Danish",
				"https://en.wikipedia.org/wiki/Fairy_Tales_Told_for_Children._First_Collection", "Fairy tales");		
		
		Book book3 = new Book("Dante Alighieri", "Italy",
				 "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Michelino_DanteAndHisPoem.jpg/450px-Michelino_DanteAndHisPoem.jpg",		
				 "Italian", "https://en.wikipedia.org/wiki/Divine_Comedy", "The Divine Comedy");
		
		List<Book> libros = new ArrayList<>();
		libros.add(book1);
		libros.add(book2);
		libros.add(book3);
		return libros;		
	}
	
}
