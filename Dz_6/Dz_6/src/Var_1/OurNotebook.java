package Var_1;


public class OurNotebook {

    String model;
    int ram;

    int hdd;
    String oSystem;
    String color;



    public OurNotebook( String model, int ram,int hdd, String oSystem, String color){

        this.model = model;
        this.color = color;
        this.ram = ram;
        this.hdd = hdd;
        this.oSystem = oSystem;

    }

    @Override
    public String toString(){
        return model + " " + ram + "Gb, " + hdd + "Gb, " +  " ОС: " + oSystem + " " + " цвет: " + color  ;
    }

    public boolean equalsOS(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof OurNotebook)){
            return false;
        }
        OurNotebook notebook = (OurNotebook) obj;
        if (oSystem.equals(notebook.oSystem)){
            return true;
        }
        else{
            return false;
        }
    }
    public String getColor() {
        return color;
    }


    public boolean equalsColore(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof OurNotebook)){
            return false;
        }
        OurNotebook notebook = (OurNotebook) obj;
        if (color.equals(notebook.color)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equalityRam(Object obj){
        if (this == obj){
            return true;
        }
        if (!(obj instanceof OurNotebook)){
            return false;
        }
        OurNotebook notebook = (OurNotebook) obj;
        if ((ram == notebook.ram)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equalityHdd(Object obj){
        // if (this == obj){
        //     return true;
        // }
        // if (!(obj instanceof OurNotebook)){
        //     return false;
        // }
        OurNotebook notebook = (OurNotebook) obj;
        if ((hdd >= notebook.hdd)){
            return true;
        }
        else{
            return false;
        }
    }


}