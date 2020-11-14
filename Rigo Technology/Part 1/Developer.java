class Developer{ //creating a class named Developer
    
      private String platform; //declaring data type
      private String interviewerName;    
      private String developerName;      
      private int workingHour;           
      
      Developer(String platform, String interviewerName, int workingHour){ //constructor with parameters
          
          this.platform = platform;
          this.interviewerName = interviewerName;
          this.workingHour = workingHour;
          this.developerName = "";
        }
        
      String getPlatform(){  //accessor method
          return this.platform;  
      }
      String getInterviewername(){
          return this.interviewerName;
      }
      String getDevelopername(){
          return this.developerName;
      }
      void setDeveloperName(String developerName) { //defining a method to set the developer name to a new name
          this.developerName = developerName;
       }
      int getWorkinghour(){
          return this.workingHour;
      }
      
      void display(){ //method for displaying information
          System.out.println("Platform:" + this.platform);
          System.out.println("Interviewers Name:" + this.interviewerName);
          System.out.println("Working hours:" + this.workingHour);
          if(this.developerName !=  "") {
              System.out.println("Developer Name:" + this.developerName);
            }
        }
    }
    
    

      