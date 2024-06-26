package mahmud.sup.galilee.pharmacy.model;

public class Invoice {

    private Long id;
    private Long userId;
    private double total;

    public Invoice() {}

    public Invoice(Long id, Long userId, double total) {
        this.id = id;
        this.userId = userId;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
