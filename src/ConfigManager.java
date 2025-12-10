
public class ConfigManager {
    private double volume;
    private String language;
    private int difficulty;

    public ConfigManager() {
        this.volume = 1.0;
        this.language = "ES";
        this.difficulty = 1;
    } 

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void printConfig() {
        System.out.println("=== Configuración del Sistema ===");
        System.out.println("Volumen: " + volume);
        System.out.println("Idioma: " + language);
        System.out.println("Dificultad: " + difficulty);
        System.out.println("=================================");
    }
}
