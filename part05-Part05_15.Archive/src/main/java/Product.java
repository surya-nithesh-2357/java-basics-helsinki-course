public class Product {
    private String name;
    private String identifier;

    public Product (String Identifier, String name){
        this.name = name;
        this.identifier = Identifier;
    }

    public String getName(){
        return this.name;
    }
    public String getIdentifier(){
        return this.identifier;
    }

    public String toString(){
        return this.identifier+ ": "+this.name;
    }

    public boolean equals(Object compared){
         if (this == compared) {
            return true;
        }

        // if the compared object is not of type Book, the objects are not equal
        if (!(compared instanceof Product)) {
            return false;
        }
        Product comparedProd = (Product) compared;
        if (this.identifier.equals(comparedProd.identifier)){
            return true;
        }
        return false;
    }
}
