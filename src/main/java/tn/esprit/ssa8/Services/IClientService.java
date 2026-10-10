package tn.esprit.ssa8.Services;

import tn.esprit.ssa8.entities.Client;

import java.util.List;

public interface IClientService {

    Client ajouterClient(Client client);

    void supprimerClient(Long id);

    List<Client> recupererClient();

    Client modifierClient(Client client);
}