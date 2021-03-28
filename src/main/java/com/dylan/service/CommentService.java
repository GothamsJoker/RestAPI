package com.dylan.service;

import com.dylan.model.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentService implements ICommentService{
    @Override
    public List<Comment> findAll() {
        List<Comment> comments = new ArrayList<>();

        comments.add(new Comment("author", "sdjknsjn", 1, 20));

        return comments;
    }
}
