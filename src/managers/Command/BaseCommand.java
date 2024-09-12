package managers.Command;

/**
 * Интерфейс для реализации команд.
 * @since 1.0
 */
public interface BaseCommand {

    /**
     * Базовый метод для вывода исполнения команды
     * Выбрасывает ошибки при реализации
     * @since 1.0
     */
    public void execute(String[] args) throws Exception;

    /**
     * Базовый метод для вывода названия команды
     * @since 1.0
     */
    public String getName();

    /**
     * Базовый метод для вывода описания команды
     * @since 1.0
     */
    public String getDescription();


}
