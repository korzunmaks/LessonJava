/**
 *Класс реализует методы калькулятора
 */
public class Calculater {
    /**
     * 
     */
    private int result;

    /**
     * Сумируем аргументы переданные 
     * param params параметры переданные для сумирования
     * 
     */
    public void add(int ... params) {
        for (Integer param : params) {
            this.result += param; 
        }
    }
    /**
    * Получаем результат из класса калькулятор
    */
    public int getResult() {
        return this.result;
    }    

    /**
    * Очищаем переменную результат
    */
    public void cleanResult() {
        this.result = 0;
    }


}


