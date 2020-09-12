package kotelnikov.servicemock.controller;

import kotelnikov.servicemock.config.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dadata")
public class DadataController {

    @Autowired
    JsonConfig jsonConfig;

    @GetMapping(path = "/sample")
    public ResponseEntity<Object> getSampleAsJson(){
        Resource resource = JsonConfig.getResource("sample.json");
        return new ResponseEntity<>(resource,HttpStatus.OK);
    }

    @GetMapping(path = "/sample-response-body")
    public @ResponseBody Resource getSampleAsResponseBody(){
        return JsonConfig.getResource("sample.json");
    }

    @GetMapping(path = "/sample-string")
    public @ResponseBody String getSampleAsString(){
        return JsonConfig.readFileToString("sample.json");
    }
}
