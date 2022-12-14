public class Human {

    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году " + " Я работаю на должности " + jobTitle + " Будем знакомы!";
    }
}
