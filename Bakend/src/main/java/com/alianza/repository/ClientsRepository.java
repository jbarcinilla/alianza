/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alianza.repository;

import com.alianza.model.Client;
import java.util.List;

/**
 *
 * @author jbarc
 */
public interface ClientsRepository {
    
    int saveClient(Client c);

    int updateClient(Client c);

    int delete(String sharedKey);

    List<Client> lstClients();
}
