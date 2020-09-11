package br.com.bandtec.projetoindividualbanco;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    List<Conta> contas = new ArrayList<>();


    @GetMapping("/listarC")
    public List<Conta> getListaC() {
        List<Conta> getLista = contas.stream().filter(conta -> conta instanceof ContaCorrente ).collect(Collectors.toList());

        return getLista;
    }

    @GetMapping("/listarP")
    public List<Conta> getListaP() {
        List<Conta> getListaP = contas.stream().filter(conta -> conta instanceof ContaPoupanca ).collect(Collectors.toList());

        return getListaP;
    }

    @PostMapping("/cadastrarContaCorrente")
    public void cadastrarCorrente(@RequestBody ContaCorrente contaCorrente){
        contas.add(contaCorrente);

    }
    @PostMapping("/cadastrarContaPoupanca")
    public void cadastrarPoupança(@RequestBody ContaPoupanca contaPoupanca){
        contas.add(contaPoupanca);

    }


}





