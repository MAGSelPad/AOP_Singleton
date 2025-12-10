
public aspect SingletonAspect {

    private ConfigManager instance = null;

    // Intercepta cualquier llamada al constructor de ConfigManager
    pointcut constructorCall():
        call(ConfigManager.new(..));

    // Advice que reemplaza la creación de instancias
    ConfigManager around(): constructorCall() {
        if (instance == null) {
            instance = proceed();
        }
        return instance;
    }
}
