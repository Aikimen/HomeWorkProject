package interfeik;

/*
Не домашка!

        Напишите интерфейс Validator

        У него есть два метода:

        boolean validate(String str);

        void setMessage(String msg);

        validate должен валидировать переданную строку и возвращать true, если строка валидная

        Если строка невалидна, валидатор должен писать в консоль message, который задается через метод setMessage и возвращать false*/
public interface Validator {
    boolean validate(String str);
    void setMessage(String message);
}
