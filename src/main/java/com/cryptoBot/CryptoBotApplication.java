package com.cryptoBot;

import com.cryptoBot.bots.ChatBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class CryptoBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoBotApplication.class, args);
		System.out.println("Helo world");
		try {
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(new ChatBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}

	}

}
