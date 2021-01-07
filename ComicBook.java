public class ComicBook extends Book{
    private String color;
    public ComicBook(double regularPrice, String publisher, int yearPublished,String color) {
        super(regularPrice, publisher, yearPublished);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double computeSalePrice(){
        return super.getRegularPrice()*0.6;
    }
}
