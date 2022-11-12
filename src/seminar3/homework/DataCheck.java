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

    public void CheckData(String[] splitedString) throws ParseInputDataException {
        if (splitedString == null) {
            throw new NullPointerException("Нет данных");
        }

        StringBuilder fullErrorsMessages = new StringBuilder();
        for (String string : splitedString) {
            if (Character.isLetter(string.charAt(0))) {
                if (string.length() == 1) {
                    if (this.gender == null) {
                        try {
                            this.gender = checkGender(string);
                        } catch (GenderException e) {
                            fullErrorsMessages.append(e.getMessage());
                        }
                    } else {
                        fullErrorsMessages.append("Гендер указан больше 1 раза\n");
                    }
                } else {
                    if (this.lastName == null) {
                        try {
                            this.lastName = checkFullName(string);
                        } catch (FullNameException e) {
                            fullErrorsMessages.append(e.getMessage());
                        }
                    } else if (this.firstName == null) {
                        try {
                            this.firstName = checkFullName(string);
                        } catch (FullNameException e) {
                            fullErrorsMessages.append(e.getMessage());
                        }
                    } else if (this.patronymic == null) {
                        try {
                            this.patronymic = checkFullName(string);
                        } catch (FullNameException e) {
                            fullErrorsMessages.append(e.getMessage());
                        }
                    } else {
                        fullErrorsMessages.append("Слишком много элементов распознаны как ФИО.\n");
                    }
                }
            } else {

                if (string.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}")) {
                    if (this.birthDate == null) {
                        try {
                            this.birthDate = checkBirthDate(string);
                        } catch (BirthDateException e) {
                            fullErrorsMessages.append(e.getMessage());
                        }
                    } else {
                        fullErrorsMessages.append("Дата рождения должна быть только одна, а обнаружены две: '"
                                + this.birthDate + "','" + string + "'\n");
                    }
                } else {
                    if (this.phone == null) {
                        try {
                            this.phone = checkPhone(string);
                        } catch (PhoneException e) {
                            fullErrorsMessages.append(e.getMessage());
                        }
                    } else {
                        fullErrorsMessages.append("Должен быть только один телефонный норме, а не несколько: '"
                                + this.phone + "','" + string + "'\n");
                    }
                }

            }
        }
        if (!fullErrorsMessages.isEmpty()) {
            throw new ParseInputDataException(fullErrorsMessages.toString());
        }
    }


}
