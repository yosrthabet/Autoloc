package tn.esprit.ssa8.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ssa8.Repositories.ClientRepository;
import tn.esprit.ssa8.entities.Client;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    private ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> recupererClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }
}