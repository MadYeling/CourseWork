package bookinfo;

public class Books {
    private int number, sales;
    private String name, version;
    private float price;

    public Books(int number, String name, String version, float price, int sales) {
        this.number = number;
        this.sales = sales;
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "图书编号:" + this.getNumber() + "\t图书名称:" + this.getName() + "\t图书版本:" + this.getVersion() + "\t图书价格:" + this.getPrice() + "\t销售额:" + this.getSales();
    }
}
