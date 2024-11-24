package com.facimp.projetoPooJava.controller.computadorController;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.facimp.projetoPooJava.controller.computadorController.dto.ComputadorRq;
import com.facimp.projetoPooJava.controller.computadorController.dto.ComputadorRs;
import com.facimp.projetoPooJava.model.modelComputador.Computador;
import com.facimp.projetoPooJava.repository.computadorRepository.ComputadorRepository;

@RestController
@CrossOrigin
@RequestMapping("/computador")
public class ComputadorControler {

    private final ComputadorRepository computadorRepository;

    public ComputadorControler(ComputadorRepository computadorRepository) {
        this.computadorRepository = computadorRepository;
    }

    @GetMapping
    public List<ComputadorRs> findAll(){
        var computador = computadorRepository.findAll();

        return computador.stream().map(ComputadorRs::converter).collect(Collectors.toList());
    }

    @GetMapping("/loja/{loja}")
    public List<ComputadorRs> findByLoja(@PathVariable("loja") String loja) {
        var computadores = computadorRepository.findByLoja(loja);

        return computadores.stream().map(ComputadorRs::converter).collect(Collectors.toList());
    }

    @GetMapping("/mac/{mac}")
    public List<ComputadorRs> findByMac(@PathVariable("mac") String mac) {
        var computadores = computadorRepository.findByMac(mac);

        return computadores.stream().map(ComputadorRs::converter).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ComputadorRs findById(@PathVariable("id") Long id){
        var computadorR = computadorRepository.findById(id);

        if (computadorR.isPresent()) {
            var computador = computadorR.get();
            return ComputadorRs.converter(computador);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Computador não encontrado");
        }
    }

    @PostMapping
    public ResponseEntity<String> saveComputador(@RequestBody ComputadorRq computador) throws Exception {
        if (!computadorRepository.existsByMac(computador.getMac())) {
            var c = new Computador();

            c.setMac(computador.getMac());
            c.setLocalHostName(computador.getLocalHostName());
            c.setProcessador(computador.getProcessador());
            c.setRamSize(computador.getRamSize());
            c.setDataDeInstalacao(computador.getDataDeInstalacao());
            c.setSistemaOperacional(computador.getSistemaOperacional());
            c.setIp(computador.getIp());
            c.setLoja(computador.getLoja());
            c.setDataAtual(computador.getDataAtual());

            computadorRepository.save(c);

            return  ResponseEntity.status(HttpStatus.CREATED).body("Comptador salvo.");
        } else {
            return  ResponseEntity.status(HttpStatus.CREATED).body("Ja existe um computador com este endereco mac.");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateComputador(@PathVariable("id") Long id, @RequestBody ComputadorRq computador) throws Exception {
        var c = computadorRepository.findById(id);

        if(c.isPresent()){
            var computadorUpdate = c.get();

            computadorUpdate.setMac(computador.getMac());
            computadorUpdate.setLocalHostName(computador.getLocalHostName());
            computadorUpdate.setProcessador(computador.getProcessador());
            computadorUpdate.setRamSize(computador.getRamSize());
            computadorUpdate.setDataDeInstalacao(computador.getDataDeInstalacao());
            computadorUpdate.setSistemaOperacional(computador.getSistemaOperacional());
            computadorUpdate.setIp(computador.getIp());
            computadorUpdate.setLoja(computador.getLoja());
            computadorUpdate.setDataAtual(computador.getDataAtual());

            computadorRepository.save(computadorUpdate);
            return  ResponseEntity.status(HttpStatus.CREATED).body("Computador encontrado");
        } else {
            return  ResponseEntity.status(HttpStatus.CREATED).body("Não possui nenhum computador com este id.");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {

        var c = computadorRepository.findById(id);

        if(c.isPresent()){
            computadorRepository.deleteById(id);
            return  ResponseEntity.status(HttpStatus.CREATED).body("Computador removido");
        } else {
            return  ResponseEntity.status(HttpStatus.CREATED).body("Nao possui nenhum computador com este id.");
        }
    }
}
