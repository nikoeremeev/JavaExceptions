package seminar3.homework;


import java.time.LocalDate;

public class DataCheck {
    public static int dataCount = 6;

    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthDate;
    private int phone;
    private Gender gender;

    public DataCheck() {
    }

    public void CheckData(String[] stringData) throws ParseInputDataException {
        if (stringData == null) {
            throw new NullPointerException("Нет данных");
        }
    }
}
