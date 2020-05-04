package wizut.tpsi.lab9;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import wizut.tpsi.lab9.BlogRepository;

@Controller
public class HomeController {
    @Autowired
    private BlogRepository br;
  
    
    @RequestMapping("/")
    public String home(Model model) throws SQLException {           
         model.addAttribute("posts",   br.getAllPosts());
         
        return "home";
    }
    
    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException {
        br.createPost(post);
        return "redirect:/";
    }
    
    @GetMapping("/deletepost")
    public String deletePost(Long id) throws SQLException {
        br.deletePost(id);
        return "redirect:/";
    }
}
