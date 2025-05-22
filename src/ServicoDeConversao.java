import com.google.gson.Gson;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoDeConversao {
    public RespostaDeConversao getMoedas (String apiKey) {
        HttpClient client = HttpClient.newHttpClient();
        URI moeda = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(moeda)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), RespostaDeConversao.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível obter a conversão." + e);
        }
    }
}
