package tn.esprit.ssa8.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ssa8.Services.IClientService;
import tn.esprit.ssa8.entities.Client;

import java.util.List;

@RequestMapping("/Client")
@RestController
@AllArgsConstructor
public class ClientController {

    private IClientService clientService;

    @PostMapping("/AjouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void supprimerClient(@PathVariable Long id) {
        clientService.supprimerClient(id);
    }

    @GetMapping("/getClients")
    public List<Client> afficherClients() {
        return clientService.recupererClient();
    }

    @PutMapping("/modifierClient")
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }
}