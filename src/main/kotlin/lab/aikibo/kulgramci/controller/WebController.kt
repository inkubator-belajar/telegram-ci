package lab.aikibo.kulgramci.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class WebController {

    @GetMapping("/")
    fun start(@RequestParam(name="nama", required = false, defaultValue = "Kamu") nama: String, model: Model): String {
        model.addAttribute("nama", nama)
        return "index"
    }

}