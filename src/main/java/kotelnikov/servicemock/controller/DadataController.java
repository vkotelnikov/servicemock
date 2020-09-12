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

    /*** Адреса ***/

    @GetMapping(path ="clean/address")
    public @ResponseBody String cleanAddress() {
        return JsonConfig.readFileToString("dadata/clean-address.json");
    }

    @GetMapping(path ="suggest/address")
    public @ResponseBody String suggestAddress() {
        return JsonConfig.readFileToString("dadata/suggest-address.json");
    }

    @GetMapping(path ="findById/address")
    public @ResponseBody String findByIdAddress() {
        return JsonConfig.readFileToString("dadata/find-by-id-address.json");
    }

    @GetMapping(path ="findById/fias")
    public @ResponseBody String findByIdFias() {
        return JsonConfig.readFileToString("dadata/find-by-id-fias.json");
    }

    /*** Компании ***/

    @GetMapping(path ="findById/party")
    public @ResponseBody String findByIdParty() {
        return JsonConfig.readFileToString("dadata/find-by-id-party.json");
    }

    @GetMapping(path ="suggest/party")
    public @ResponseBody String suggestParty() {
        return JsonConfig.readFileToString("dadata/suggest-party.json");
    }

    @GetMapping(path ="findAffiliated/party")
    public @ResponseBody String findAffiliatesParty() {
        return JsonConfig.readFileToString("dadata/find-affiliated-party.json");
    }

    /*** Люди ***/

    @GetMapping(path ="clean/name")
    public @ResponseBody String cleanName() {
        return JsonConfig.readFileToString("dadata/clean-name.json");
    }

    @GetMapping(path ="suggest/fio")
    public @ResponseBody String suggestFio() {
        return JsonConfig.readFileToString("dadata/suggest-fio.json");
    }




    @GetMapping(path = "/sample")
    public ResponseEntity<Object> getSampleAsJson() {
        Resource resource = JsonConfig.getResource("sample.json");
        return new ResponseEntity<>(resource, HttpStatus.OK);
    }

    @GetMapping(path = "/sample-response-body")
    public @ResponseBody
    Resource getSampleAsResponseBody() {
        return JsonConfig.getResource("sample.json");
    }

    @GetMapping(path = "/sample-string")
    public @ResponseBody
    String getSampleAsString() {
        return JsonConfig.readFileToString("sample.json");
    }
}
