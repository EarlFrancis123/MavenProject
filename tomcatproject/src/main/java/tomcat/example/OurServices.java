package tomcat.example;

public class OurServices extends ExampleSupport {
    

    public String execute()  {
    
        setDescription(descriptionAddition());

        return SUCCESS;
    }

    private String[] StringArray ={ "Appliance Repair","Electrical Repair","Plumbing","HVAC","Air Duct Cleaning"};
    private String Description = "OUR SERVICES:  ";

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
