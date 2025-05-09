package com.yurdan.bankCardService.controller.rest;

import com.yurdan.bankCardService.model.entity.BankAccount;
import com.yurdan.bankCardService.service.BankCardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
@RequiredArgsConstructor
public class BankCardController {

    private BankCardService bankCardService;

    @GetMapping
    public ResponseEntity<List<BankAccount>> getAllCards() {

        return ResponseEntity.ok(bankCardService.getAllCards());
    }

    @PostMapping
    public ResponseEntity<BankAccount> createCard(@RequestBody BankAccount bankAccount) {
        return ResponseEntity.ok(bankCardService.createCard(bankAccount));
    }

    // Другие эндпоинты для блокировки, активации и удаления карт

}
