//package org.acme;
//
//import org.acme.domain.User;
//import org.acme.repository.UserDao;
//import org.jboss.resteasy.annotations.jaxrs.PathParam;
//import javax.ws.rs.*;
//import java.util.Optional;
//@Path("/user")
//public class ExampleResource {
//    private UserDao userdao;
//    public ExampleResource(UserDao userdao){
//        this.userdao =userdao;
//    }
//    @GET
//    public Iterable<User> findAll() {
//        return userdao.findAll();
//    }
//    @DELETE
//    @Path("{id}")
//    public void delete(@PathParam long id) {
//        userdao.deleteById(id);
//    }
//    @Path("/uname/{uname}/password/{password}")
//    public User create(@PathParam String uname, @PathParam String password) {
//        return userdao.save(new User(uname,password));
//    }
//    @PUT
//    @Path("/uid/{uid}/password/{password}")
//    public User changePassword(@PathParam Long uid, @PathParam String password) {
//        Optional<User> optional = userdao.findById(uid);
//        if (optional.isPresent()) {
//            User user = optional.get();
//            user.setPassword(password);
//            return userdao.save(user);
//        }
//
//        throw new IllegalArgumentException("No User with uid " + uid + " exists");
//    }
//    @GET
//    @Path("/uname/{uname}")
//    public User findByUname(@PathParam String uname) {
//        return userdao.findByUname(uname);
//    }
//}