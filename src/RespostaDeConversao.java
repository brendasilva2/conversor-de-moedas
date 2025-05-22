import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class RespostaDeConversao {
    @SerializedName("result")
    private String resultado;
    @SerializedName("base_code")
    private String moedaBase;
    @SerializedName("conversion_rates")
    private Map<String, Double> taxaDeConversao;

    public String getResultado() {
        return resultado;
    }

    public String getMoedaBase() {
        return moedaBase;
    }

    public Map<String, Double> getTaxaDeConversao() {
        return taxaDeConversao;
    }
}
