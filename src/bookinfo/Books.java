package bookinfo;

public class Books {
    private int number, sales;
    private String name, version;
    private float price;

    Books(int number, String name, String version, float price, int sales) {
        this.number = number;
        this.sales = sales;
        this.name = name;
        this.version = version;
        this.price = price;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getSales() {
        return sales;
    }

    void setSales(int sales) {
        this.sales = sales;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getVersion() {
        return version;
    }

    void setVersion(String version) {
        this.version = version;
    }

    float getPrice() {
        return price;
    }

    void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "图书编号:" + this.getNumber() + "\t图书名称:" + this.getName() + "\t图书版本:" + this.getVersion() + "\t图书价格:" + this.getPrice() + "\t销售额:" + this.getSales();
    }
}
