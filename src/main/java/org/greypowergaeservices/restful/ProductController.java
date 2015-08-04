package org.greypowergaeservices.restful;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping(value = "/api/product", method = RequestMethod.GET, 
            produces = "application/json")
    @ResponseBody
    public int createJewelProduct(@RequestParam(value="name", defaultValue="World") String name) {
        return 1;
    }
}
