package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Cliente;


public class ClienteService {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void creaCliente(Cliente clienteNuevo) {
        clientes.add(clienteNuevo);
    }

public List<Cliente> getClientes() {
    return clientes;
}

        
        public int creaIdLinea() {
            int max = 1123226456;

           int nuevaLinea= max + clientes.size();
           
            return nuevaLinea;
    
        }





}
