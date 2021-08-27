/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alianza.repository;

import com.alianza.model.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jbarc
 */
@Repository
public class JdbcClientsRepository implements ClientsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int saveClient(Client c) {
        return jdbcTemplate.update(
                " INSERT INTO public.clients\n"
                + "(sharedkey, businessid, emails, phone, dataadded)\n"
                + "VALUES(?, ?, ?, ?, ?);",
                c.getSharedKey(), c.getBusinessid(), c.getEmails(), c.getPhone(), c.getDataadded());
    }

    @Override
    public int updateClient(Client c) {
        return jdbcTemplate.update(
                " UPDATE public.clients\n"
                + "SET sharedkey=?, businessid=?, emails=?, phone=?, dataadded=?;",
                c.getSharedKey(), c.getBusinessid(), c.getEmails(), c.getPhone(), c.getDataadded());
    }

    @Override
    public int delete(String sharedKey) {
        return jdbcTemplate.update(
                " DELETE FROM public.clients\n"
                + "WHERE sharedkey=?;",
                sharedKey);
    }

    @Override
    public List<Client> lstClients() {
        return jdbcTemplate.query(
                " SELECT sharedkey, businessid, emails, phone, dataadded\n"
                + "FROM public.clients;",
                (rs, rowNum)
                -> new Client(
                        rs.getString("sharedkey"),
                        rs.getString("businessid"),
                        rs.getString("emails"),
                        rs.getString("phone"),
                        rs.getString("dataadded")
                )
        );
    }

}
