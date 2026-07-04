package az.babayev.javarush.exercise.level2;

/*
Вы создаете копию названия проекта, чтобы внести в неё изменения.
Создайте переменную String projectName и присвойте ей значение "Java".
Затем создайте другую переменную String newProjectName и присвойте ей значение projectName.
После этого измените newProjectName на "Java Programming".
Выведите значения обеих переменных на экран.
*/
public class Task14 {
    static void main() {
        String projectName = "Java";
        String newProjectName = projectName;
        newProjectName = "Java Programming";
        System.out.println(projectName);
        System.out.println(newProjectName);
    }
}
