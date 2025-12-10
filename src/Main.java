public class Main {
    public static void main(String[] args) {

        ConfigManager c1 = new ConfigManager(); // interceptado por el aspecto
        ConfigManager c2 = new ConfigManager(); // devuelve la MISMA instancia

        c1.setVolume(50);
        c2.setLanguage("EN");
        c1.setDifficulty(3);

        c1.printConfig();
        c2.printConfig();

        System.out.println("c1 == c2?: " + (c1 == c2)); // true gracias al aspecto
    }
}
