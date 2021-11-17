package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Cliente;


public class ClienteService {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void creaCliente(int dni, String nombre, String apellido, String tipoContribuyente) {
        clientes.add(new Cliente(dni, nombre, apellido, tipoContribuyente));
    }





}
