package cn.edu.cufe.dao;

import cn.edu.cufe.entity.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {
    List<Comment> selectComment(@Param("book_id") int bookId);

    Integer addComment(@Param("book_id") int bookId, @Param("content") String content, @Param("creator") String creator);

    Integer updateThumb(@Param("id") int id);

    Integer removeComment(@Param("id") int id);

    Integer countComment(@Param("id") int id);
}
