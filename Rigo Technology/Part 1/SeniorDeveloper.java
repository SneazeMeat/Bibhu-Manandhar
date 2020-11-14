class SeniorDeveloper extends Developer {  //creating a sub class SeniorDeveloper of class Developer
    private double salary;//attributes
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private double advanceSalary;
    private boolean appointed;
    private boolean terminated;
    
    SeniorDeveloper(String platform, String interviewerName, int workingHour, double salary, int contractPeriod) {
        super(platform, interviewerName, workingHour);//method to calling the superclass(Developer) contructor
        this.salary = salary;
        this.contractPeriod = contractPeriod;
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.advanceSalary = 0.0;
        this.appointed = false;
        this.terminated = false;
    }
    
    double getSalary(){
        return this.salary;
    }
    int getContractPeriod(){
        return this.contractPeriod;
    }
    String getJoiningDate(){
        return this.joiningDate;
    }
    String getStaffRoomNumber(){
        return this.staffRoomNumber;
    }
    double getAdvanceSalary(){
        return this.advanceSalary;
    }
    boolean getAppointed(){
        return this.appointed;
    }
    boolean getTerminated(){
        return this.terminated;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
    void setContractPeriod(int contractPeriod) {
        this.contractPeriod = contractPeriod;
    }   
       
    void hireDeveloper(String developerName, String joiningDate, double advanceSalary, String staffRoomNumber) {
        boolean isAppointed = getAppointed();//condition
        if (isAppointed) {
            System.out.println("Developer Name" + developerName);
            System.out.println("Staff Room Number" + staffRoomNumber);
        } else {
            setDeveloperName(developerName);
            this.joiningDate = joiningDate;
            this.advanceSalary = advanceSalary;
            this.staffRoomNumber = staffRoomNumber;
            this.appointed = true;
            this.terminated = false;
            

        }
            
    }
    
    void contactTermination() {
        boolean isTerminated = getTerminated();
        if (isTerminated){
            System.out.println("The contact is terminated");
        } else {
            setDeveloperName("");
            this.joiningDate = "";
            this.advanceSalary = 0.0;
            this.appointed = false;
            this.terminated = true;
        }        
    }
    
    void displayDetail() {
        String platform = getPlatform();
        String interviewerName = getInterviewername();
        System.out.println("Platform: " + platform);
        System.out.println("Interviewers Name: " + interviewerName);
        System.out.println("Developer Salary" + getSalary());
    }
    
    void display() {
        super.display();//also displays from super class
        boolean isAppointed = getAppointed();
        if (isAppointed) {
            System.out.println("Termination Status: " + getTerminated());
            System.out.println("Joining Date:"  + getJoiningDate());
            System.out.println("Advance Salary:" + getAdvanceSalary());
            System.out.println("Developer Name:" + getDevelopername());
          
        }
    }
    
}