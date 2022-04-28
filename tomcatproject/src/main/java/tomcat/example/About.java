package tomcat.example;

public class About  extends ExampleSupport{
    

        public String execute()  {
            setName("Earl Francis Tajanlangit");
            setIntroductionMessage(Introduction());
    
            return SUCCESS;

            
        }
        public String name ;
        public String Descrive = "this is about page: ";
        public String IntroductionMessage;

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

