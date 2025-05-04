import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Conversor buscaConversorMoeda(String base_code,
                                         String target_code) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/e148f5d15c38125b765f50f8/pair/"+base_code+"/"+target_code);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            return new Gson().fromJson(json, Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter essa Moeda");
        }

    }
}
