package clio.chemmy.web;

import clio.chemmy.data.ElementRepository;
import clio.chemmy.entity.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/show")
public class ElementController {
    @Autowired
    private final ElementRepository elRepo;
    public ElementController(ElementRepository elRepo) {
        this.elRepo = elRepo;
    }
    @ModelAttribute(name = "element")
    public Element element() {
        return new Element();
    }
    @GetMapping
    public String showDesignForm(Model model) {
        List<Element> elements = new ArrayList<>();
        elRepo.findAll().forEach(i -> elements.add(i));
        model.addAttribute("elements", elements);
        //System.out.println(elements.get(0));
        return "table";
    }
}
