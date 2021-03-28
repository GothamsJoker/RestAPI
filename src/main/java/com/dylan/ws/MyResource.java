package com.dylan.ws;

import com.dylan.model.Comment;
import com.dylan.service.ICommentService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("comments")
public class MyResource {

    @Inject
    private ICommentService commentService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response message(){

        List<Comment> comments = commentService.findAll();
        GenericEntity<List<Comment>> myEntity = new GenericEntity<List<Comment>>(comments){};

        return Response.status(200).entity(myEntity).build();
    }
}
