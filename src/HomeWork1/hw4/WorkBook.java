package HomeWork1.hw4;

public class WorkBook {
/*
    5)  Создать класс Конспект. Класс должен содержать следующие поля:
    название предмета;
    ФИО студента;
    количество страниц;
    год выпуска;
    цвет обложки.
    Название заведения, где учится студент;

    Создайте публичные методы для получения доступа к полям класса,
    а также методы для присваивания значений полям класса.
*/
    public String nameOfSubject;
    public String fmlNameOfStudent;
    public int pageValue;
    public int year;
    public String calorOfWorkbook;
    public String nameOfCampus;

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public String getFmlNameOfStudent() {
        return fmlNameOfStudent;
    }

    public int getPageValue() {
        return pageValue;
    }

    public int getYear() {
        return year;
    }

    public String getCalorOfWorkbook() {
        return calorOfWorkbook;
    }

    public String getNameOfCampus() {
        return nameOfCampus;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public void setFmlNameOfStudent(String fmlNameOfStudent) {
        this.fmlNameOfStudent = fmlNameOfStudent;
    }

    public void setPageValue(int pageValue) {
        this.pageValue = pageValue;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCalorOfWorkbook(String calorOfWorkbook) {
        this.calorOfWorkbook = calorOfWorkbook;
    }

    public void setNameOfCampus(String nameOfCampus) {
        this.nameOfCampus = nameOfCampus;
    }
}

