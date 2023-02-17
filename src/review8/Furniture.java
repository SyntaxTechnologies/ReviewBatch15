package review8;

public class Furniture {
    public void assemble(){
        System.out.println("Furniture needs to be assembled");
    }

    public void comfort(){ //overriden
        System.out.println("Furniture needs to be comfortable");
    }
}

class Chair extends Furniture{

    public void comfort(){ //overriding

        System.out.println("Not every chair is comfortable");
    }

    protected void loveSeat(){
        System.out.println("This is the best chair");
    }
}

class Table extends Furniture{

    public void comfort(){

        System.out.println("Table cannot be comfortable");
    }

    protected void buildTable(){
        System.out.println("We can easily build a table");
    }

    void buildTable(String material){
        System.out.println("We build table from "+material);
    }
}