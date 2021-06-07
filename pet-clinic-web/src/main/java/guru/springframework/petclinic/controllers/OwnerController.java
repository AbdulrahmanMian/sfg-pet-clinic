package guru.springframework.petclinic.controllers;

import guru.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController     {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    //@RequestMapping({ "/owners","/owners/index","owners/index.html"})
    @RequestMapping({ "","/","/index", "/templates/index.html"})
    //Since owners is used in every quote, it can also be stated above in order to not replicate it
    // at the requestmapping above the method.

    public String listOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }
    @RequestMapping({ "/find"})
    public String findOwners(){

        return "notimplemented";
    }

}
