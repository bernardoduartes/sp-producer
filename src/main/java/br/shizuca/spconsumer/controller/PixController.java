package br.shizuca.spconsumer.controller;


import br.shizuca.spconsumer.dto.PixDTO;
import br.shizuca.spconsumer.dto.PixStatus;
import br.shizuca.spconsumer.service.PixService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/pix")
@RequiredArgsConstructor
public class PixController {

    private final PixService pixService;

    @PostMapping
    public PixDTO salvarPix(@RequestBody PixDTO pixDTO) {

        pixDTO.setIdentifier(UUID.randomUUID().toString());
        pixDTO.setDataTransferencia(LocalDateTime.now());
        pixDTO.setStatus(PixStatus.EM_PROCESSAMENTO);

        return pixService.salvarPix(pixDTO);
    }
}
