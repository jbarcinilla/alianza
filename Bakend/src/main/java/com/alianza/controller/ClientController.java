/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alianza.controller;

import com.alianza.model.Client;
import com.alianza.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jbarc
 */
@RestController
@RequestMapping("alianza/webresources/")
public class ClientController {

    @Autowired
    private ClientsRepository service;

    @PostMapping(path = "servicios/saveClient", consumes = "application/json", produces = "application/json")
    public String saveClient(@RequestBody Client c) {
        int response = service.saveClient(c);
        if (response > 0) {
            return "{\"save\":true}";
        }
        return "{\"save\":false}";
    }

    @PostMapping(path = "servicios/updateClient", consumes = "application/json", produces = "application/json")
    public String updateClient(@RequestBody Client c) {
        int response = service.updateClient(c);
        if (response > 0) {
            return "{\"update\":true}";
        }
        return "{\"update\":false}";
    }

    @DeleteMapping(path = "servicios/deleteClient", consumes = "text/plain", produces = "application/json")
    public String deleteClient(@RequestBody String sharedkey) {
        int response = service.delete(sharedkey);
        if (response > 0) {
            return "{\"deleteClient\":true}";
        }
        return "{\"deleteClient\":false}";
    }
}
