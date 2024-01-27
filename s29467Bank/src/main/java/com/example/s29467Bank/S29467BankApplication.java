package com.example.s29467Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S29467BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(S29467BankApplication.class, args);
	}

}
//1. rejestracja -> id i przypisane saldo
//2. przelew -> wczytuje id i wartość przelewu, zwraca status acc or dec i nowe saldo
//3.wpłacanie -> id i wartość wpłaty, zwraca nowe saldo + status
//4.odczytanie id clienta
//5. jesli wszystko ok to acc jesli brakuje id, za małe saldo zwroc decline
//+testy/mocki




