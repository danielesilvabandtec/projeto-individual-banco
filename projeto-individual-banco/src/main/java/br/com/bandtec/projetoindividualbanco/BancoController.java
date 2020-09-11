package br.com.bandtec.projetoindividualbanco;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/banco")
public class BancoController {


    List<Cliente> listclientes = new ArrayList<>();
    @GetMapping("/listar")
    public List<Cliente> getLista() {
        List<Cliente> getLista = listclientes.stream().filter(cliente -> cliente instanceof Cliente ).collect(Collectors.toList());

        return getLista;
    }
    @PostMapping("/cadastrarCliente")
    public void cadastrarCliente(@RequestBody Cliente cliente ){
        listclientes.add(cliente);

    }
    @DeleteMapping("/deleta/{id}")
    public void deletarCli(@PathVariable int id  ){
        listclientes.remove(id-1);

    }

}
