package review8;

public class Store {

    public static void main(String[] args) {



        Furniture table=new Table();
        table.comfort(); //runtime polymorphism
        table.assemble();

        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable("Wood");

        Chair.breaks();
        Furniture.breaks(); //static method called by using class name

        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort(); //runtime polymorphism
        //proof that method breaks is not overriden
        chair.breaks(); //since we are not overriding methods breaks will be executed from Parent
                        //this is also not the right way to call static method
    }
}
