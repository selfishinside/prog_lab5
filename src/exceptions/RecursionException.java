package exceptions;

/**
 * Обеспечивает исключение при появлении рекурсии во время выполнения скрипт файла
 * @see managers.Command.ExecuteScriptCommand
 * @since 1.0
 */
public class RecursionException extends Exception{
    public RecursionException() {
        super("Recursion in file");
    }
}
