
package jp.co.handson.app.top;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("top")
public class TopController {

    @RequestMapping(value = "/init", method = {
            RequestMethod.GET, RequestMethod.POST
    })
    public String init(Model model) {
        return "top/top";
    }
}
