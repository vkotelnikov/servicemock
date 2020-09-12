package kotelnikov.servicemock.controller;

import kotelnikov.servicemock.config.JsonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/focus")
public class FocusController {


    @GetMapping(path ="/req")
    public @ResponseBody String req() {
        return JsonService.readFileToString("focus/req.json");
    }

    @GetMapping(path ="/egrDetails")
    public @ResponseBody String egrDetails() {
        return JsonService.readFileToString("focus/egr-details.json");
    }

    @GetMapping(path = "/analytics")
    public @ResponseBody String analytics() {
        return JsonService.readFileToString("focus/analytics.json");
    }

    @GetMapping(path ="/excerpt", produces = "application/pdf")
    public @ResponseBody String excerpt() {
        return JsonService.readFileToString("focus/excerpt.pdf");
    }


}
