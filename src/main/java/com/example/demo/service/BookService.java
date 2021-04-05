package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Books;
import com.example.demo.dao.BookRepository;
@Service
public class BookService
{
@Autowired
BookRepository bookrepo;
public List<Books> getallBooks()
{
	return bookrepo.findAll();
	
}
public Books getBooksById(int id)   
{  
return bookrepo.findById(id).get();  
}  

public void saveOrUpdate(Books books)   
{  
bookrepo.save(books);  
}  
 
public void delete(int id)   
{  
bookrepo.deleteById(id);  
}   
public void update(Books books, int bookid)   
{  
bookrepo.save(books);  
}  
}  




