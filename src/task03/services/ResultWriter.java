package task03.services;

import java.util.Map;

public class ResultWriter {
    public static String write(Map<Double, Double> map){
        StringBuilder sb = new StringBuilder();
        map.forEach((key, value) -> {
            sb.append(String.format("%.4f", key));
            sb.append(" ");
            sb.append(String.format("%.4f", value));
            sb.append("\n");
        });
        return sb.toString();
    }
}
