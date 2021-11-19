package service;

import java.util.ArrayList;
import java.util.List;

import dominio.Cliente;


public class ClienteService {

    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void creaCliente(Cliente clienteNuevo) {
        clientes.add(clienteNuevo);
    }

    public   Cliente getCliente(int dni){

        return clientes.stream().filter((c)-> c.getDni()==dni).findFirst().get();
        
/*         for (Cliente cliente : clientes) {

            if(cliente.getDni()==dni){
                cliente
            } else {
                return ;
            }
 */

            
        }

        
        public int creaIdLinea() {
            int max = 1123226456;

           int nuevaLinea= max + clientes.size();
           
            return nuevaLinea;
    
        }





}
