package tomcat.example;

public class ContactUs extends ExampleSupport {
 

        public String execute()  {
    
            setDescription(descriptionAddition());
    
            return SUCCESS;
        }

        private String[] StringArray ={ "093256723823","09325634678","09324235672","093234673235","093468273467"};
        private String Description = "MY MOBILE NUMBER: ";

        private String descriptionAddition(){
          
            double num1;
            num1= Math.floor(Math.random()* 4 + 0);
            
            return Description + StringArray[(int)num1];
    
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
        public void setDescription(String description) {
            Description = description;
        }
        
}

