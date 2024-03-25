package main.en;

public enum Status {
    ACCEPTED("Принят"),
    IN_WORK("В работе"),
    WAITING("Ожидание"),
    FINISHED("Работы завершены");

    private String info;

    private Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }
}