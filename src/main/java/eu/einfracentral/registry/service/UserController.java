package eu.einfracentral.registry.service;

import eu.einfracentral.domain.aai.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Created by pgl on 07/08/17.
 */
@RestController
@RequestMapping("user")
public class UserController extends GenericRestController<User> {
    final private UserService userService;

    @Autowired
    UserController(UserService service) {
        super(service);
        this.userService = service;
    }

    @CrossOrigin
    @RequestMapping(path = "activate/{token}", method = RequestMethod.GET)
    public void activate(@PathVariable String token) {
        this.userService.activate(token);
    }

    @CrossOrigin
    @RequestMapping(value = "register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> registerJSON(@RequestBody User user) {
        this.userService.register(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> login(@RequestBody User user) {
//        Claims claims = Jwts.claims().setSubject(user.getUsername());
//        claims.put("id", user.getId() + "");
//
//        return Jwts.builder()
//                .setClaims(claims)
//                .signWith(SignatureAlgorithm.HS512, secret)
//                .compact();
//        Authentication auth = new UsernamePasswordAuthenticationToken();
//        if (SecurityContextHolder.getContext() != null) {
////            auth = SecurityContextHolder.getContext().getAuthentication();
//            System.out.println(auth.isAuthenticated());
////        }
        if (true) throw new Error("Login requires satanic intervention!");
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @CrossOrigin
//    @RequestMapping(value = "register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_XML_VALUE)
//    public ResponseEntity<String> registerXML(@RequestBody String body) {
//        this.userService.register(body);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
