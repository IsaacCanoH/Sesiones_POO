package mx.utng.s25.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import mx.utng.s25.model.entity.User;
import mx.utng.s25.model.service.IUserService;

@Controller
public class UseController {

    @Autowired
    private IUserService userService;

    @GetMapping({"", "/", "/list"})
    public String list(Model model) {
        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("users", userService.list());
        return "List";
    }

    @GetMapping("/form")
    public String create(Model model) {
        model.addAttribute("title", "Formulario de usuarios");
        model.addAttribute("user", new User());
        return "form";
    }

    @GetMapping("/form/{id}")
    public String update(@PathVariable Long id, Model model) {
        if (id > 0) {
            User user = userService.getById(id);
            model.addAttribute("title", "Editar usuario");
            model.addAttribute("user", user);
        } else {
            return "redirect:/list";
        }
        return "form";
    }

    @PostMapping("/form")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult br, Model model) {
        if (br.hasErrors()) {
            model.addAttribute("title", "Formulario de usuarios");
            return "form";
        }
        userService.save(user);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        if (id > 0) {
            userService.delete(id);
        }
        return "redirect:/list";
    }
}

