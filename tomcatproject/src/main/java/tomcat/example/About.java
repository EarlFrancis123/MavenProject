package tomcat.example;

import org.apache.struts2.components.Else;

public class About  extends ExampleSupport{
    

        public String execute()  {
            setName("Earl Francis Tajanlangit");
            setIntroductionMessage(Introduction());
            setDescription(descriptionAddition());
    
            if(username.equals("Regular")){
                return "Regular";
            }
            
            return SUCCESS;

            
        }
        String username = "";
        public String name ;
        public String Descrive = " this about";
        public String IntroductionMessage;
        private String[] StringArray ={ "Earl Tajanlangit","Joshua Torres","Jungie Gerez","Ian Pelayo","Diane Sagarino"};
        private String Description = "OUR TECHNICIAN: ";

        private String descriptionAddition(){
          
        double num1;
        num1= Math.floor(Math.random()* 4 + 0);
        
        return Description + StringArray[(int)num1];
        

        }






        public String getUsername() {
            return username;
        }






        public void setUsername(String username) {
            this.username = username;
        }






        public void setDescription(String description) {
            Description = description;
        }

       




        public String[] getStringArray() {
            return StringArray;
        }





        public void setStringArray(String[] stringArray) {
            StringArray = stringArray;
        }





        public String getDescription() {
            return Description;
        }





        public  String Introduction(){
            return "hellow my name is " + this.name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getDescrive() {
            return Descrive;
        }
        public void setDescrive(String descrive) {
            Descrive = descrive;
        }
        public String getIntroductionMessage() {
            return IntroductionMessage;
        }
        public void setIntroductionMessage(String introductionMessage) {
            IntroductionMessage = introductionMessage;
        }
        
        
        
}

