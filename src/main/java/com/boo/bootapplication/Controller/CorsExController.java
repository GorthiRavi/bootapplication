package com.boo.bootapplication.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
/*
 * Controlller level cross origin
@CrossOrigin(origins = "http://localhost:9090")
*/
public class CorsExController {

/*
  * method level cross origin
    @CrossOrigin(origins = "http://localhost:9090")
*/
    @RequestMapping(value = "/corsUrl/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct(@PathVariable("id") String id, @RequestParam("pid") String pid){
        return new ResponseEntity<>("Accesing CORS URL", HttpStatus.OK);
    }
}
