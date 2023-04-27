package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Client;
import org.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(Constant.API_CLIENT)
    public void save(@RequestBody Client client) {
        clientService.save(client);
    }

    @GetMapping(Constant.API_CLIENT)
    public List<Client> findAll() {
        return clientService.findAll();
    }

    @PutMapping(Constant.API_CLIENT)
    public void update(@RequestBody Client client) {
        clientService.save(client);
    }

    @DeleteMapping(Constant.API_CLIENT + "/{id}")
    public void delete(@PathVariable("id") String id) {
        clientService.delete(id);
    }

    @GetMapping(Constant.API_CLIENT + "/{id}")
    public Optional<Client> findById(@PathVariable("id") String id) {
        return clientService.findById(id);
    }

}