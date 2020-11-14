class JuniorDeveloper extends Developer {//creating a sub class JuniorDeveloper of class Developer
    private double salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    JuniorDeveloper(String platform, String interviewerName, int workingHour, double salary, String appointedBy, String terminationDate){
        super(platform, interviewerName, workingHour);
        this.salary = salary;
        this.appointedBy = appointedBy;
        this.terminationDate = terminationDate;
        this.appointedDate = "";
        this.evaluationPeriod = "";
        this.specialization = "";
        this.joined = false;
    }
    
    double getSalary(){
        return this.salary;
    }
    String getAppointedBy(){
        return this.appointedBy;
    }
    String getTerminationDate(){
        return this.terminationDate;
    }
    String getAppointedDate(){
        return this.appointedDate;
    }
    String getEvaluationPeriod(){
        return this.evaluationPeriod;
    }
    String getSpecialization(){
        return this.specialization;
    }
    boolean getJoined(){
        return this.joined;
    }
    
    void setSalary(double newSalary){
        if (!this.joined) {
            this.salary = newSalary;
        } else {
            System.out.println("Developer has already been hired so salary cannot be changed now.");
        }
    }
    
    void appointDeveloper(String developerName, String appointedDate, String terminationDate, String specialization){
        if (!this.joined) {
            super.setDeveloperName(developerName);
            this.appointedDate = appointedDate;
            this.terminationDate = terminationDate;
            this.specialization = specialization;
            this.joined = true;
        } else {
            System.out.println(super.getDevelopername() + " has already been appointed on" + this.appointedDate);
        }
    }
    
    void display(){
        super.display();
        if(this.joined) {
            System.out.println("Appointed Date:" + getAppointedDate());
            System.out.println("Developers Name:" + getDevelopername());
            System.out.println("Evaluation Period:" + getEvaluationPeriod());
            System.out.println("Termination Date:" + getTerminationDate());
            System.out.println("Developer Salary:" + getSalary());
            System.out.println("Developer Specialization:" + getSpecialization());
            System.out.println("Developer Appointed:" + getAppointedBy());
        }
    }
}
    