package Animals;

public class Dog {

    private String name;
    private String color;
    private int height;
    private double weight;

    // constructors
    public Dog(String name, int weight, String color, int height){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.height = height;
    }
    // constructor empty in cas of a scenario where the attributes are not defined in the creation of the object
    public Dog(){

    }
    String humor = "ok";
    public void comer(){

    }

    public void latir(){
        System.out.println("Au au");
    }

    public String getToy(){
        return "toy";
    }
    public String playWith(String action){

        /*if (action.equals("pet")){
            this.humor = "Happy";
        } else if(action.equals("give a toy")){
            this.humor = "Excited";
        } else if(action.equals("give a shower")){
            this.humor = "Sad";
        }*/

        switch(action){
            case "pet": this.humor = "Happy"; break;
            case "give a toy": this.humor = "Excited"; break;
            case "give a shower": this.humor = "Sad"; break;

        }

        return this.humor;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
