package com.Security.security.Controller;


import com.Security.security.Entity.User;
import com.Security.security.Repository.UserRepo;
import com.Security.security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/reg")
    public String getRegPage()
    {
        return "Reg";
    }

    @PostMapping("/reg")
    public String postRegPage(User user, Model model)
    {
        User user1=userRepo.findByUserName(user.getUserName());
           if(user1!=null)
           {
               System.out.println("user exists");
               model.addAttribute("warning ","user exsists");
               return "Reg";
           }

           userRepo.save(user);

        return  "redirect:/Login";
    }



}
