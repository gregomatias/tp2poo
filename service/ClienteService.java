package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Cliente;
import dominio.Cuenta;

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

        int nuevaLinea = max + clientes.size();

        return nuevaLinea;

    }

    public Cliente devuelveCliente(int dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni() == dni) {
                return cliente;

            }
        }

        return null;
    }

    public Cuenta devuelveCuenta(Cliente cliente, String domicilio) {
        for (Cuenta cuenta : cliente.getCuentas()) {
            if (cuenta.getDomicilio().equals(domicilio)) {
                return cuenta;

            }
        }

        return null;
    }

}
