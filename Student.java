public Student(int id, String name, double gpa) {

    if (gpa < 0 || gpa > 10) {
        throw new InvalidGpaException(
                "GPA must be between 0 and 10"
        );
    }

    this.id = id;
    this.name = name;
    this.gpa = gpa;
}
