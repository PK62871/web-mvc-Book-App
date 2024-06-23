package in.ashokit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;

@Controller
public class BookController {

	
	@Autowired
	private BookRepository bookRepository;
	
	
	
	
	//Get Book Based On Id:--
//	
//	@GetMapping("/book")
//	public ModelAndView getBookById(@RequestParam("id")Integer bookId) {
//		
//		ModelAndView mv=new ModelAndView();
//		
//		Optional<Book> findById = bookRepository.findById(bookId);
//		if(findById.isPresent()) {
//			Book book = findById.get();
//			
//			
//			
//			//Sending Data to the view
//			mv.addObject("book",book);
//		}else {
//			mv.addObject("msg","Book Not Present With this Id :"+bookId);
//		}
//		
//		//Setting View page Name.
//		mv.setViewName("index");
//		return mv;
//		
//	}
	
	//Get Book Based On Id:-- In Another Way Both Are Same.
	
		@GetMapping("/book")
		public String  getBookById(@RequestParam("id")Integer bookId,Model model) {
			
			Optional<Book> findById = bookRepository.findById(bookId);
			if(findById.isPresent()) {
				Book book = findById.get();
				model.addAttribute("book",book);
			}else {
				model.addAttribute("msg","Book Not Found With this :"+bookId);
			}
			//Setting View page Name.
			return "index";
			
		}
	

}
