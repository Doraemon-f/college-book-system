package cn.edu.cufe.dao;

import cn.edu.cufe.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    List<Book> selectBooks();
}
