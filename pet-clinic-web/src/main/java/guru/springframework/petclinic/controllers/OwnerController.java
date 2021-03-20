package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController     {
    //@RequestMapping({ "/owners","/owners/index","owners/index.html"})
    @RequestMapping({ "","/","/index","/index.html"})
    //Since owners is used in every quote, it can also be stated above in order to not replicate it
    // at the requestmapping above the method.
    public String listOwners(){
        return "owners/index";
    }
}
