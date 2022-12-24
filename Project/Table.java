import java.util.ArrayList;
public class Table {
    private int id; // номер столика
    private ArrayList<String> order; // заказ
    private boolean isfree; // свободен ли столик

    public Table(int id, boolean isfree) {
        this.id = id;
        this.isfree = isfree;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public ArrayList<String> getOrder() {

        return order;
    }

    public void setOrder() {

        this.order = order;
    }

    public boolean isFree() {

        return isfree;
    }

    public void setFree(boolean isfree) {

        this.isfree = isfree;
    }
}
