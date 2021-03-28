package com.dylan.service;

import com.dylan.model.Comment;

import java.util.List;

public interface ICommentService {
    public List<Comment> findAll();
}
